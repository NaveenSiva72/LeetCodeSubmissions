class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        int oneCount=0;
        ArrayList<Integer> curr=new ArrayList<>();
        for(int i=0;i<nums.size();i++)
        {
            String current=Integer.toBinaryString((i));
            oneCount=0;
            for(int j=0;j<current.length();j++)
            {
                if(current.charAt(j)=='1')
                {
                    oneCount++;
                }
            }
            if(oneCount==k)
            {
                ans+=nums.get(i);
            }
        }
        
        return ans;
    }
}