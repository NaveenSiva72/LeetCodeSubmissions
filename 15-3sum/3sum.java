class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int currNum=0;
        for(int i=0;i<nums.length;)
        {
            int start=i+1;
            int end=nums.length - 1;
            int currTarget=0 - nums[i];
            while(start < end)
            {
                if((nums[start]+nums[end])==currTarget)
                {
                    List<Integer> curr=new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[start]);
                    curr.add(nums[end]);
                    ans.add(curr);
                    currNum=nums[start];
                    while(start<end && nums[start]==currNum)
                    {
                        start++;
                    }
                    currNum=nums[end];
                    while(end > start && nums[end]==currNum)
                    {
                        end--;
                    }

                }
                else if((nums[start] + nums[end]) < currTarget)
                {
                    currNum=nums[start];
                    while(start<end && nums[start]==currNum)
                    {
                        start++;
                    }
                }
                else 
                {
                    currNum=nums[end];
                    while(end > start && nums[end]==currNum)
                    {
                        end--;
                    }
                }
            }
            currNum=nums[i];
            while(i<nums.length && nums[i]==currNum)
            {
                i++;
            }
        }
        return ans;
    }
}