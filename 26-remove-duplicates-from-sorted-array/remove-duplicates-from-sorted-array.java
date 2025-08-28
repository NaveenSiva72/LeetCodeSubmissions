class Solution {
    public int removeDuplicates(int[] nums) {
        int r = 1;
        int len = nums.length;
        if(len <= 1){
            return len;
        }
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[i-1]){
                nums[r] = nums[i];
                r++;
            }
        }
        return r;
        
    }
}