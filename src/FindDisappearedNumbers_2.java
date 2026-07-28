import java.util.*;


class FindDisappearedNumbers_2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindDisappearedNumbers_2 solution = new FindDisappearedNumbers_2();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = new ArrayList<>();
        result = solution.findDisappearedNumbers(nums);
        System.out.println(result);
    }
}
