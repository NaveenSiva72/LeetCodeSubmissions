class Solution {
    public void moveZeroes(int[] nums) {
        int numPointer = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[numPointer] = nums[i] ;
                if(numPointer!=i)
                {
                    nums[i]=0;
                }
                numPointer++;
            }
        }
        
    }
}