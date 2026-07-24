class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
        }
        int left = 0, right = 0;
        while (right < s2.length()) {
            if (Arrays.equals(s2Count, s1Count)) {
                return true;
            }
            if (right < s1.length()) {
                s2Count[s2.charAt(right) - 'a']++;
                System.out.println("First if: " + Arrays.toString(s2Count));
            } else {
                s2Count[s2.charAt(left) - 'a']--;
                s2Count[s2.charAt(right) - 'a']++;
                left++;
                System.out.println("Else: " + Arrays.toString(s2Count));
            }
            right++;
        }
        return Arrays.equals(s2Count, s1Count);
    }
}

void main(String[] args) {
    Solution solution = new Solution();
    String s1 = "ab";
    String s2 = "eidbaooo";
    boolean inclusion = solution.checkInclusion(s1, s2);
    System.out.println(inclusion);
}