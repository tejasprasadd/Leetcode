//Two-Pointer solution with extra space
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1, resIndex = n - 1;
        int[] result = new int[n];
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[resIndex] = nums[left] * nums[left];
                left++;
            } else {
                result[resIndex] = nums[right] * nums[right];
                right--;
            }
            resIndex--;
        }
        return result;
    }
}


void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {-4, -1, 0, 3, 10};
    int[] result = solution.sortedSquares(nums);
    System.out.println(Arrays.toString(result));
}