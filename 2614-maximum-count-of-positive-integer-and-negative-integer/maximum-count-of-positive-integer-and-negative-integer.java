class Solution {
    public int maximumCount(int[] nums) {
        // int ind = findMinusOne()
        if(nums[0]>0){
            return nums.length;
        }
        if(nums[nums.length - 1]<0){
            return nums.length;
        }
        int i=0;
        int zero = 0;
        int j =0;
        while(j<nums.length){
            if(nums[j]<=-1){
                i++;
                j++;
                continue;
            }
            if(nums[j]>0){
                break;
            }
            zero++;
            j++;
            
            
        }
        if(i > (nums.length - i - zero)){
            return i;
        }
        return nums.length - i - zero;
    }
}