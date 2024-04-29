class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=-1;
        }
        return ans(nums , 0 , dp);
    }
    public int ans(int[] nums  , int ind , int[] dp)
    {
        if(ind==nums.length - 1)
        {
            return 0;
        }
        if(ind>=nums.length)
        {
            return Integer.MAX_VALUE;
        }
        if(nums[ind]==0)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int curr=Integer.MAX_VALUE;
        for(int i=1;i<=nums[ind];i++)
        {
            int a=ans(nums , ind + i , dp);
            if(a==Integer.MAX_VALUE)
            {
                continue;
            }
            curr=Math.min((a + 1) , curr);
            
        }
        dp[ind]=curr;
        return dp[ind];
    }
}