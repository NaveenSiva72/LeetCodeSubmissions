class Solution {
    public int[] applyOperations(int[] nums) {
        

        for(int i=0;i<nums.length - 1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i] * 2;
                nums[i+1]=0;
            }
        }
        int zeroCount=0;
        int insertPosi = 0;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[insertPosi++] = nums[i];
            }
            else
            {
                zeroCount++;
            }
        }
        System.out.println(Arrays.toString(nums));
        int len = nums.length - 1;
        while(zeroCount > 0)
        {
            nums[len--] = 0;
            zeroCount--;
        }

        return nums;
        
        
    }
}