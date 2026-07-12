class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                result[0] = left;
                result[1] = right;
                break;
            }
            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}

void main(String[] args) {
    Solution solution = new Solution();
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    int[] result = solution.twoSum(numbers, target);
    System.out.println(Arrays.toString(result));
}