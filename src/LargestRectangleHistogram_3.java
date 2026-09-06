import java.util.Stack;

public static class LargestRectangleinHistogram_3 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[stack.peek()] >= heights[i])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}

public static void main(String[] args) {
    LargestRectangleinHistogram_3 solution = new LargestRectangleinHistogram_3();
    int[] heights = {2, 1, 5, 6, 2, 3};
    int result = solution.largestRectangleArea(heights);
    System.out.println(result);
}

