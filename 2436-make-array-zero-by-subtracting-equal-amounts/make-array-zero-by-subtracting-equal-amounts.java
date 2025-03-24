class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            ans++;
            for(int j=i+1;j<nums.length;j++){
                nums[j]-=nums[i];
            }
            nums[i]=0;
        }
        return ans;
    }
}