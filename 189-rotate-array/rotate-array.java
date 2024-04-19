class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] temp=new int[nums.length - k];
        
        for(int i=0;i<nums.length - k;i++)
        {
            temp[i]=nums[i];
        }
        int tempp=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<k)
            {
                nums[i]=nums[nums.length + i - k];
            }
            else
            {
                nums[i]=temp[tempp++];
            }
        }
        
    }
}