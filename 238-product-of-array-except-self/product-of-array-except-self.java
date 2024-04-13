class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums.length <= 1)
        {
            return nums;
        }
        int[] ans=new int[nums.length];
        ans[0]=1;
        ans[ans.length - 1]=1;
        for(int i=1;i<nums.length;i++)
        {
            ans[i]=nums[i-1] * ans[i-1];
        }
        int pre=0;
        int suff=nums[nums.length - 1];
        for(int i=nums.length - 2;i>=0;i--)
        {
           
            ans[i]=ans[i] * suff;
            suff = suff * nums[i];
        }
        return ans;
    }
}