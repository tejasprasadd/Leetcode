class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result += i - nums[i];
        }
        return result;
    }
}

public void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {3, 0, 1};
    int result = solution.missingNumber(nums);
    System.out.println(result);
}