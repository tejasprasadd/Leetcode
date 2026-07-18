//Brute Force solution
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}


void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {-4, -1, 0, 3, 10};
    int[] result = solution.sortedSquares(nums);
    System.out.println(Arrays.toString(result));
}