class Solution {
    public int maxProfit(int[] prices) {
        int i;
        int profit = 0;
        for(i=1;i<prices.length;i++)
        {
               if(prices[i] > prices[i-1])
               {
                  profit += prices[i] - prices[i-1];
               }
        }
        return profit;
    }
}