class MissingNumber_2 {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result += i - nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        MissingNumber_2 solution = new MissingNumber_2();
        int[] nums = {3, 0, 1};
        int result = solution.missingNumber(nums);
        System.out.println(result);
    }
}
