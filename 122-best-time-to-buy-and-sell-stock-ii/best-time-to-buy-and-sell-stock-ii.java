class Solution {
    public int maxProfit(int[] prices) {
        int buyDate=0;
        int sellDate=0;
        int profit=0;
        int n=prices.length;
        while(buyDate < n- 1 && sellDate<n-1)
        {
            while(buyDate < n - 1 && prices[buyDate + 1] < prices[buyDate])
            {
                buyDate++;
            }
            sellDate = buyDate;
            while(sellDate < n - 1 && prices[sellDate + 1] > prices[sellDate])
            {
                sellDate++;
            }
            
            profit=Math.max(profit  ,profit +  (prices[sellDate] - prices[buyDate]));
            buyDate=sellDate + 1;
        }
        return profit;
        
    }
}