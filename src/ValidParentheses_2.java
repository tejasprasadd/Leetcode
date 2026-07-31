import java.util.List;
import java.util.*;

//Brute Force solution
class ValidParentheses_2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses_2 solution = new ValidParentheses_2();
        String s = "([)]";
        boolean result = solution.isValid(s);
        System.out.println(result);
    }
}