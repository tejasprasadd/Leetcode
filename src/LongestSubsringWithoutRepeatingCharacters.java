import java.util.*;

class LongestSubsringWithoutRepeatingCharacters {
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

    public static void main(String[] args) {
        LongestSubsringWithoutRepeatingCharacters solution = new LongestSubsringWithoutRepeatingCharacters();
        String s = "au";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);

    }
}
