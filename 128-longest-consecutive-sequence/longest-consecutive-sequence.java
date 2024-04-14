class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int ans=1;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i : nums)
        {
            if(!(set.contains(i - 1)))
            {
               ans=Math.max(ans , chkInTheDecreasingOrder(set , i));
            }
        }
        return ans;
    }
    public int chkInTheDecreasingOrder(HashSet<Integer> set , int currentNum)
    {
        int inc=1;
        while(set.contains(++currentNum))
        {
            inc++;
        }

        return inc;
    }
}