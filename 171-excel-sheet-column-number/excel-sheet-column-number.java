class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        int pow =0;
        for (int i=columnTitle.length() - 1;i>=0;i--)
        {
            int curr = (((columnTitle.charAt(i)) - 'A') + 1);
            if (pow>0)
            {
                curr = curr * (int)(Math.pow(26,pow++));
            }
            else
            {
                pow++;
            }
            ans = ans + curr;
        }
        return ans;
        
    }
}