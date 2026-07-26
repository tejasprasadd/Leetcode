
// Sliding Window solution
class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        int have = 0, need = countT.size();
        int[] result = {-1, 1};
        int resultLength = Integer.MAX_VALUE;
        int left = 0, right = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
                have++;
            }
            while (have == need) {
                if ((right - left + 1) < resultLength) {
                    resultLength = right - left + 1;
                    result[0] = left;
                    result[1] = right;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)) {
                    have--;
                }
                left++;
            }
            right++;
        }
        return resultLength == Integer.MAX_VALUE ? "" : s.substring(result[0], result[1] + 1);
    }
}


void main(String[] args) {
    Solution solution = new Solution();
    String s = "ADOBECODEBANC";
    String t = "ABC";
    String result = solution.minWindow(s, t);
    System.out.println(result);
}