// Recursive solution

public class ReverseLinkedList_2 {

    public ListNode reverseList(ListNode head) {
        if(head ==null){
            return null;
        }
        ListNode newHead = head;
        if(head.next!=null){
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        head.next=null;

        return newHead;
    }

    // Helper: build a linked list from an int array
    public static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper: print the linked list
    public static void printList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(" -> ");
            head = head.next;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        ReverseLinkedList_2 solution = new ReverseLinkedList_2();

        int[] input = {1, 2, 3, 4, 5};
        ListNode head = buildList(input);

        System.out.print("Original: ");
        printList(head);

        ListNode reversed = solution.reverseList(head);

        System.out.print("Solution  : ");
        printList(reversed);
    }
}