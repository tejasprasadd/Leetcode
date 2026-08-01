public class BinarySearch_1 {
// Classic Algorithm
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right )/ 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch_1 solution = new BinarySearch_1();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = solution.search(nums, target);
        System.out.println(result);
    }
}
