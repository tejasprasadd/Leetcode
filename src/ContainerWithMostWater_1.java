
// Brute Force ContainerWithMostWater_1
class ContainerWithMostWater_1 {
    public int maxArea(int[] height) {
        int result = 0;
        int n = height.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int current = Math.min(height[i], height[j]) * (j - i);
                result = Math.max(current, result);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        ContainerWithMostWater_1 solution = new ContainerWithMostWater_1();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        System.out.println(result);
    }
}
