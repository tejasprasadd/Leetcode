import java.util.Arrays;


class MajorityElement_1 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];
    }

    public static void main(String[] args) {
        MajorityElement_1 solution = new MajorityElement_1();
        int[] nums = {3,2,3};
        int result = solution.majorityElement(nums);
        System.out.println(result);
    }
}
