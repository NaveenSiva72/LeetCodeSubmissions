class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        map.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
        }
        return false;

        
    }
}