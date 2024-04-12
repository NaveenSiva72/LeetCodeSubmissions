class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map=new HashMap<>();
        List<Integer>[] arr=new List[nums.length + 1];
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            
        } 
        int temp;
        for(Integer i : map.keySet())
        {
            temp=map.get(i);
            if(arr[temp] == null)
            {
                arr[temp]=new ArrayList<>();
            }
            arr[temp].add(i);
        }
        // System.out.println(Arrays.toString(arr));
        int[] ans=new int[k];
        temp=0;
        for(int i=arr.length - 1;i>=0 && temp<k;i--)
        {
            if(arr[i] != null)
            {
                int curr=0;
                while(curr < arr[i].size() && temp<k)
                {
                    ans[temp++]=arr[i].get(curr++);
                }
            }
            
        }
        return ans;
    }
}