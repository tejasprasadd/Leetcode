public class LargestRectangleinHistogram_1 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int height = heights[i];

            int rightMost = i + 1;
            while (rightMost < n && heights[rightMost] >= height) {
                rightMost++;
            }

            int leftMost = i;
            while (leftMost >=0 && heights[leftMost] >= height) {
                leftMost--;
            }
            //These 2 lines beloew is present because the while loop shoots the values to the first invalid respective value and hence we are moving back to that last valid one
            rightMost--;
            leftMost++;
            maxArea = Math.max(maxArea, height * (rightMost - leftMost + 1));
        }
        return maxArea;
    }

    static void main(String[] args) {
        LargestRectangleinHistogram_1 solution = new LargestRectangleinHistogram_1();
        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = solution.largestRectangleArea(heights);
        System.out.println(result);
    }
}
