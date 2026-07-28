import java.util.*;

//Two-Pointer solution with extra space
class SquaresofSortedArray_4 {
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

    public static void main(String[] args) {
        SquaresofSortedArray_4 solution = new SquaresofSortedArray_4();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
