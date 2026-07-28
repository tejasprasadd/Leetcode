import java.util.Arrays;

// Boyer - Moore Algorithm
class MajorityElement_2 {
    public int majorityElement(int[] nums) {
        int result, count = 0;
        result = nums[0];
        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            count += (result == num) ? 1 : -1;
        }
        return result;
    }

    public static void main(String[] args) {
        MajorityElement_2 solution = new MajorityElement_2();
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);
        System.out.println(result);
    }
}
