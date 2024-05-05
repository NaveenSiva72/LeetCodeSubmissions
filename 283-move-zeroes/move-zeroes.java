class Solution {
    public void moveZeroes(int[] nums) {
        int changePosition = 0;
        for (int i = 0; i < nums.length;i++) {
            if(nums[i]!=0)
            {
                nums[changePosition]=nums[i];
                if(changePosition!=i)
                {
                    nums[i]=0;
                }
                changePosition++;
                
            }
        }
        return;
    }
}