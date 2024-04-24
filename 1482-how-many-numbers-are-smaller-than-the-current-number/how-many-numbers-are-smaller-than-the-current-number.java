class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] minCount=new int[100+1];
        for(int i=0;i<nums.length;i++)
        {
            minCount[nums[i]]=++minCount[nums[i]];
        }
        for(int i=1;i<minCount.length;i++)
        {
            minCount[i]=minCount[i] + minCount[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=0;
            }
            else
            {
                nums[i]=minCount[nums[i] - 1];
            }
        }
        return nums;
    }
}