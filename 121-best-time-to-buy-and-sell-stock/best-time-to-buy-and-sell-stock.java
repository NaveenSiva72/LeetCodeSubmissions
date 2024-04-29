class Solution {
    public int maxProfit(int[] prices) {
        int curr = 0;
        int gain = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                // gain = Math.max(curr, gain);
                curr = 0;
            }
            else
            {
                 gain = Math.max(gain, prices[i]-min);
            }
        }
        // gain = Math.max(curr, gain);
        return gain;
    }
}