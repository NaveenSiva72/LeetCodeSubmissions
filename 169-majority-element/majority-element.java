class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int vote = 0;
        for(int i=0;i<nums.length;i++){
            if(vote == 0){
                candidate = nums[i];
                vote = 1;
            }
            else if (candidate != nums[i]){
                vote--;
            }else if (candidate == nums[i]){
                vote++;
            }
        }
        return candidate;
    }
}