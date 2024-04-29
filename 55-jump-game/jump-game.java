class Solution {
    public boolean canJump(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=-1;
        }
        return chk(nums ,0 , dp);   
    }
    public boolean chk(int[] nums , int ind , int[] dp)
    {
        if(ind == nums.length - 1)
        {
            return true;
        }
        if(ind >=nums.length)
        {
            return false;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind]==1 ? true : false ;
        }
        for(int i=1;i<=nums[ind];i++)
        {
            if(chk(nums , ind + i , dp))
            {
                dp[ind]=1;
                return true;
            }
        }
        dp[ind]=0;
        return false;
        
    }
}