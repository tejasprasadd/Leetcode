import java.util.Arrays;

// Brute-Force Approach

public class DailyTemperatures_1 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    answer[i] = count;
                    break;
                }
                count++;
            }
        }
        return answer;
    }

    static void main(String[] args) {
        DailyTemperatures_1 solution = new DailyTemperatures_1();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] answer = solution.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(answer));

    }
}
