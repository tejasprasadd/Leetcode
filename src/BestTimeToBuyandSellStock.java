// Sliding window  method
class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int left = 0, right = 1, n=prices.length;
        while (right < n) {
            if (prices[right] < prices[left]) {
                left = right;
            } else {
                result = Math.max(result, prices[right] - prices[left]);
            }
            right++;
        }
        return result;
    }
}

void main(String[] args) {
    Solution solution = new Solution();
    int[] prices = {7, 1, 5, 3, 6, 4};
    int result = solution.maxProfit(prices);
    System.out.println(result);
}