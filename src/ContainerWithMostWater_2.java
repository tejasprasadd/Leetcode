
// Two Pointers solution
class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int n = height.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int current = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(current, result);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return result;

    }
}

void main(String[] args) {
    Solution solution = new Solution();
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int result = solution.maxArea(height);
    System.out.println(result);
}