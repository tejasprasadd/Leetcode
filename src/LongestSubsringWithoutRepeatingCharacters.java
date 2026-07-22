import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int maxLength = 0, left = 0, right = 0, n = s.length();
        Set<Character> seen = new HashSet<>();
        while (right < n) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}


void main(String[] args) {
    Solution solution = new Solution();
    String s = "au";
    int result = solution.lengthOfLongestSubstring(s);
    System.out.println(result);

}