class Solution {
    public int maxProfit(int[] prices) {
        int maxValue = prices[prices.length - 1];
        int maxProfit = 0;
        for(int i = prices.length - 2; i >= 0; --i) {
            if(prices[i] >= maxValue) {
                maxValue = prices[i];
                continue;
            }
            else{
                if(maxValue - prices[i] > maxProfit) {
                    maxProfit = maxValue - prices[i];
                }
            }
        }
        return maxProfit;
    }
}