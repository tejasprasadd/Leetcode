/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Fast and slow pointer approach
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;

        }
        return false;
    }

    //Helper: Builds a linked list from an array of values
    private static ListNode buildList(int[] values){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for(int v: values){
            current.next = new ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    //Helper: Creates the cycle in the linked list
    private static ListNode createCycle(int[] values, int pos){
        ListNode head = buildList(values);
        if (pos < 0) return head;

        ListNode cycleNode = head;
        for (int i = 0; i < pos; i++) {
            cycleNode = cycleNode.next;
        }

        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = cycleNode;
        return head;
    }

    public static void main(String[] args) {
        LinkedListCycle solution = new LinkedListCycle();

        ListNode noCycle = createCycle(new int[]{3, 2, 0, -4}, -1);
        System.out.println(solution.hasCycle(noCycle));

        ListNode withCycle = createCycle(new int[]{3, 2, 0, -4}, 1);
        System.out.println(solution.hasCycle(withCycle));

        ListNode single = createCycle(new int[]{1}, -1);
        System.out.println(solution.hasCycle(single));

        ListNode singleCycle = createCycle(new int[]{1}, 0);
        System.out.println(solution.hasCycle(singleCycle));
    }
}
