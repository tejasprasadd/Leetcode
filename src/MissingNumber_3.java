class MissingNumber_3 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = (n * (n + 1)) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return result - actual;
    }

    public static void main(String[] args) {
        MissingNumber_3 solution = new MissingNumber_3();
        int[] nums = {3, 0, 1};
        int result = solution.missingNumber(nums);
        System.out.println(result);
    }
}
