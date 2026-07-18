//Heap solution
class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
            pq.add(nums[i]);
        }
        int i = 0;
        while (!pq.isEmpty()) {
            nums[i++] = pq.poll();
        }
        return nums;
    }
}


void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {-4, -1, 0, 3, 10};
    int[] result = solution.sortedSquares(nums);
    System.out.println(Arrays.toString(result));
}