class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int curr = 0;

        for(int i=1;i<prices.length;i++){
            
            if(prices[i] < min){
                min = prices[i];
            }else {
                curr = prices[i] - min;
                if(curr > profit){
                    profit = curr;
                }
                

            }
            // System.out.println(curr +" " + profit +" "+ min +" "+ i);
            // System.out.println(profit);
            // System.out.println(min);

        }
        return profit;
        
    }
}