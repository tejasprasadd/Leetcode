class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int curent_num = nums[i];
            int current_seq_length = 1;
            while (numberExists(nums, curent_num + 1)) {
                curent_num += 1;
                current_seq_length += 1;
            }
            result = Math.max(result, current_seq_length);
        }
        return result;
    }

    private boolean numberExists(int[] nums, int num) {
        for (int i = 0; i<nums.length; i++){
            if (nums[i] == num) {
                return true;
            }
        }
        return false;
    }
}

public void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {100, 4, 200, 1, 3, 2};
    int result = solution.longestConsecutive(nums);
    System.out.println(result);
}