import java.util.Arrays;
import java.util.Stack;


//Monotonic Stack
public class DailyTemperatures_2 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<int[]> stack = new Stack<>(); // Pair: [temperature, index]
        for (int i = 0; i < n; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && t > stack.peek()[0]) {
                int[] pair = stack.pop();
                answer[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t, i});
        }
        return answer;
    }

    static void main(String[] args) {
        DailyTemperatures_2 solution = new DailyTemperatures_2();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] answer = solution.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(answer));

    }
}
