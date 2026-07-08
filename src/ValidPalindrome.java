class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = cleaned.length();
        for (int i = 0; i < (n / 2) ; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
void main(String[] args) {
    Solution solution = new Solution();
    String s = "A man, a plan, a canal: Panama";
    boolean result = solution.isPalindrome(s);
    System.out.println(result);
}