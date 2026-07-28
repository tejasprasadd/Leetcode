import java.util.*;

class ProductOfArrayExceptSelf_2 {
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

    public static void main(String[] args) {
        ProductOfArrayExceptSelf_2 solution = new ProductOfArrayExceptSelf_2();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}
