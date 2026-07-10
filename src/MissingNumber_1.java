class Solution {
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
}

public void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {3,0,1};
    int result = solution.missingNumber(nums);
    System.out.println(result);
}