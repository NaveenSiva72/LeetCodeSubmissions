class Solution {
    public void sortColors(int[] nums) {
        int z = 0;
        int s = nums.length - 1;
        int temp = 0;

        for(int i=0;i<=s;){
            if(nums[i]==0){
                temp = nums[z];
                nums[z++] = 0;
                nums[i++] = temp;
                
            }
            else if(nums[i]==2){
                temp = nums[s];
                nums[s--] = 2;
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
    }
}