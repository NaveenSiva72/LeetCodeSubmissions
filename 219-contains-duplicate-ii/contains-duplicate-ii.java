class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> map = new HashSet<>();
        map.add(nums[0]);
        for(int i=1;i<=k && i<nums.length;i++){
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
        }
        int inc =0;
        for(int i=k+1;i<nums.length;i++){
            map.remove(nums[inc]);
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
            inc++;
        }

        return false;

    

    }
}