class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int minIndex  = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min =  prices[i];
                minIndex = i;
            }
        }
         for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min2  && i != minIndex) {
                min2 =  prices[i];
            }
        }
        if(min + min2 >  money) {
            return money;
        }
        return money - min  - min2;
    }
}