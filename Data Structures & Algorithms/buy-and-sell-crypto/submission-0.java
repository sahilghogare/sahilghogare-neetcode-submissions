class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxprofit = 0;

        for(int i = 1;i < prices.length;i++)
        {
            profit = profit + (prices[i] - prices[i - 1]);
            if(profit < 0)
            {
                profit = 0;
            }
            maxprofit = Math.max(profit, maxprofit);
        }
        return maxprofit;
    }
}
