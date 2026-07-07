import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            int current_num = nums[i];
            int current_seq_length = 1;
            if (!num_set.contains(current_num - 1)) {
                while (num_set.contains(current_num + 1)) {
                    current_num += 1;
                    current_seq_length += 1;
                }
            }
            result = Math.max(result, current_seq_length);
        }
        return result;
    }
}

public void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {100, 4, 200, 1, 3, 2};
    int result = solution.longestConsecutive(nums);
    System.out.println(result);
}