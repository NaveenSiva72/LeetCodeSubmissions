class Solution {
    public int minimumRecolors(String blocks, int k) {
        int action = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length() - k;i++)
        {
            int curr = i;
            int count = 1;
            while(curr < blocks.length() && count++ <= k )
            {
                if(blocks.charAt(curr) == 'W'){
                    action++;
                }
                curr++;
            }
            if(action < ans){
                ans = action;
            }
            action = 0;
        }
        return ans;
    }
}