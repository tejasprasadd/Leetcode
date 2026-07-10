class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = (n * (n + 1)) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return result - actual;
    }
}

public void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {3, 0, 1};
    int result = solution.missingNumber(nums);
    System.out.println(result);
}