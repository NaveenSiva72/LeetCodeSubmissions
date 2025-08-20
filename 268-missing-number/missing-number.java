class Solution {
    public int missingNumber(int[] nums) {

        int n=0;
        for(int i=0;i<nums.length;i++){
            n+=nums[i];
        }
        return totalSum(nums.length) - n;
        
    }
    public int totalSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;

    }
}