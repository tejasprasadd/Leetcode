import java.util.*;
// Brute Force MinimumWindowSubstring_1
class MinimumWindowSubstring_1 {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        int[] result = {-1, 1};
        int resultLength = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> countS = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                countS.put(s.charAt(j), countS.getOrDefault(s.charAt(j), 0) + 1);

                boolean flag = true;
                for (char c : countT.keySet()) {
                    if (countS.getOrDefault(c, 0) < countT.get(c)) {
                        flag = false;
                        break;
                    }
                }
                if (flag && (j - i + 1) < resultLength) {
                    resultLength = j - i + 1;
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return resultLength == Integer.MAX_VALUE ? "" : s.substring(result[0], result[1] + 1);
    }

    public static void main(String[] args) {
        MinimumWindowSubstring_1 solution = new MinimumWindowSubstring_1();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solution.minWindow(s, t);
        System.out.println(result);
    }
}
