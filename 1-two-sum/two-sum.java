class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cu=0;
        for(int i =0 ;i<nums.length;i++){
            cu = target - nums[i];
            if(map.containsKey(cu)){
                return new int[]{map.get(cu), i};
            }
            map.put(nums[i], i);

        }
        return new int[]{0,0};
    }
}