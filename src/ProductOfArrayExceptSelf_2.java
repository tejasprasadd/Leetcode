class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int totalLeftPrefixProduct = 1;
        int totalRightSuffixProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = totalLeftPrefixProduct;
            totalLeftPrefixProduct *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= totalRightSuffixProduct;
            totalRightSuffixProduct *= nums[i];

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