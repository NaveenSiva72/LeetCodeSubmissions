class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int st = 0;
        int end = nums.length - 1;
        int sum =0;
        while(st<end){
            sum = nums[st]+nums[end];
            if(sum>target){
                end--;
            }else if(sum<target){
                st++;
            }else{
                ans[0]=st+1;
                ans[1]=end+1;
                return ans;
            }
        }
        return ans;
        
    }
}