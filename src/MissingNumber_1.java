import java.util.*;
class MissingNumber_1 {
    public int missingNumber(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MissingNumber_1 solution = new MissingNumber_1();
        int[] nums = {3,0,1};
        int result = solution.missingNumber(nums);
        System.out.println(result);
    }
}
