class Solution {
    public void sortColors(int[] nums) {
        int z = 0;
        int s = nums.length - 1;
        if(nums.length<=1){
            return;
        }
        for(int i=0;i<nums.length && i<=s;){
            if(nums[i]==1){
                i++;
            }else if(nums[i]==0){
                nums[i]=nums[z];
                nums[z]=0;
                z++;
                i++;
            }else{
                nums[i]=nums[s];
                nums[s]=2;
                s--;
            }
            
        }
        
    }
}