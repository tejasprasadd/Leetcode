import java.util.Arrays;

// Boyer - Moore Algorithm
class Solution {
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
}

void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {3, 2, 3};
    int result = solution.majorityElement(nums);
    System.out.println(result);
}