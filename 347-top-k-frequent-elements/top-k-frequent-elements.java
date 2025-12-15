class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashSet[] set = new HashSet[nums.length+1];

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[k];

        for(int i=0;i<nums.length;i++){
            int ind = map.getOrDefault(nums[i], 0) + 1;

            if(set[ind] != null && set[ind].size()!=0){
                if(ind - 1 > 0){
                    set[ind - 1].remove(nums[i]);
                }
                set[ind].add(nums[i]);
            }else{
                if(set[ind - 1] != null){
                    set[ind - 1].remove(nums[i]);
                }
                set[ind] = new HashSet<>();
                set[ind].add(nums[i]);
            }
            map.put(nums[i],ind);
        }
        int len = set.length - 1;
        int ind = 0;

        while(k > 0){
            if(set[len] == null){
                len--;
                continue;
            }
            for(Object i: set[len]){
                ans[ind++]= (int) i;
                k = k - 1;
            }
            len--;
        }

        return ans;
    }
}