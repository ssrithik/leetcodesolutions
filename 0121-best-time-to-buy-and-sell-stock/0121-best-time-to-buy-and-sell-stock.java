class Solution {
    public int maxProfit(int[] prices) {
       int mini = Integer.MAX_VALUE;
       int profit = 0;
       int i;
       for(i=0;i<prices.length;i++)
       {
        if(prices[i] < mini)
        {
            mini = prices[i];
        }
        if((prices[i] - mini) > profit )
        {
            profit = prices[i] - mini;
        }
       }
       return profit;
    
    }
}