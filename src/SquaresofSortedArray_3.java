//Two-Pointer solution with extra space
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0,  right = n - 1;
        List<Integer> result = new ArrayList<>();
        while (left <= right) {
            int leftSquared = nums[left] * nums[left];
            int rightSquared = nums[right] * nums[right];
            if (rightSquared > leftSquared) {
                result.add(rightSquared);
                right--;
            } else {
                result.add(leftSquared);
                left++;
            }
        }
        Collections.reverse(result);
        return result.stream().mapToInt(i -> i).toArray();
    }
}


void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {-4, -1, 0, 3, 10};
    int[] result = solution.sortedSquares(nums);
    System.out.println(Arrays.toString(result));
}