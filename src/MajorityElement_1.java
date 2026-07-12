import java.util.Arrays;


class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];
    }
}

void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {3,2,3};
    int result = solution.majorityElement(nums);
    System.out.println(result);
}