class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int currentMin = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=currentMin){
                currentMin = nums[i];
            }else{
                ans = Math.max(ans, nums[i] - currentMin);
            }
        }
        return ans;
    }
}