class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum=0;
        int curr =0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            if(curr > maxSum){
                maxSum = curr;
            }
            if(nums[i]==0){
                curr = 0;
            }
            
        }
        return maxSum;
    }
}