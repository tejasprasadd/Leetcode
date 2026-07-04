class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] leftPrefix = new int[n];
        int[] rightPrefix = new int[n];
        leftPrefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftPrefix[i] = leftPrefix[i - 1] * nums[i];
        }
        rightPrefix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightPrefix[i] = rightPrefix[i + 1] * nums[i];
        }
        result[0] = rightPrefix[1];
        result[n - 1] = leftPrefix[n - 2];
        for (int i = 1; i < n - 1; i++) {
            result[i] = leftPrefix[i - 1] * rightPrefix[i + 1];
        }
        return result;
    }
}

public void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {1, 2, 3, 4};
    int[] result = solution.productExceptSelf(nums);

    System.out.println(Arrays.toString(result));
}