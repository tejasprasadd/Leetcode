class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0, maxFreq = 0;
        int[] count = new int[26];
        int left = 0, right = 0, n = s.length();
        while (right < n) {
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            while (right - left + 1 - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}


void main(String[] args) {
    Solution solution = new Solution();
    String s = "ABAB";
    int k = 2;
    int result = solution.characterReplacement(s, k);
    System.out.println(result);
}