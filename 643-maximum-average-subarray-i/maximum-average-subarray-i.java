class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        ans=sum/k;
        int minusInitial=0;
        for(int i=k;i<nums.length;i++)
        {
            sum-=nums[minusInitial++];
            sum+=nums[i];
            ans = sum/k > ans ? sum/k : ans;
        }
        return ans;
    }

}