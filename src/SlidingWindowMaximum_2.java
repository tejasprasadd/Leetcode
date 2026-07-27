// Sliding Window solution with Queue (optimal one brooo)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            while (!deque.isEmpty() && deque.getLast() < num) {
                deque.pollLast();
            }
            deque.addLast(num);

            if (i >= k && nums[i - k] == deque.getFirst()) {
                deque.pollFirst();
            }

            if (i >= k - 1) {
                result.add(deque.getFirst());
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}

void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
    int[] result = solution.maxSlidingWindow(nums, k);
    System.out.println(Arrays.toString(result));
}