class Solution {
    public int maxProfit(int[] prices) {
        int i,j;
        int profit = 0;
        for(i=0;i<prices.length;i++)
        { 
            for(j=i+1;j<prices.length;j++)
            {
                int res = 0;
                 res = prices[j]-prices[i];
                 if(res > profit)
                 {
                    profit = res;
                 }
            }
        }
        return profit;
    }
}