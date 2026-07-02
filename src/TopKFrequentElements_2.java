import java.util.*;
// Min Heap Solution
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));
        for (int key : count.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        while (k-- > 0) {
            result[k] = minHeap.poll();
        }
        return result;
    }
}

public void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {1, 1, 1, 2, 2, 3};
    int k = 2;
    int[] result = solution.topKFrequent(nums, k);
    System.out.println(Arrays.toString(result));
}
