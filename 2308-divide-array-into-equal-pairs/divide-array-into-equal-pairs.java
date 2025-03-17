class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if (nums[i]!=nums[i-1]){
                if(count%2!=0)
                {
                    return false;
                }
                count=1;
            }else{
                count++;
            }
        }
        return true;


        
    }
}