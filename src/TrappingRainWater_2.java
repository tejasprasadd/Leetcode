
//Two Pointer  solution
public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int n = height.length, result = 0, left = 0, right = n - 1;
        int leftMax = height[left], rightMax = height[right];
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                result += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                result += rightMax - height[right];
            }
        }
        return result;
    }
}

void main(String[] args) {
    Solution solution = new Solution();
    int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int result = solution.trap(height);
    System.out.println(result);
}