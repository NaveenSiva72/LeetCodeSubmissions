class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int st=0;
        int end=0;
        int ans=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i : people)
        {
            arr.add(i);
        }
        boolean endd=false;
        while(arr.size()>=1)
        {
            st=0;
            end=arr.size() - 1;
            // System.out.println(arr);
            if(endd)
            {
                ans+=arr.size();
                break;
            }
            
            while(st < end)
            {
                int curr=arr.get(st)+arr.get(end);
                if(curr<=limit)
                {
                    ans++;
                    arr.remove(st);
                    arr.remove(end - 1);
                    break;
                }
                else if (curr<limit)
                {
                    st++;
                }
                else
                {
                    end--;
                }
            }
            // System.out.println(st+"  "+end+" "+ans);
            if(st >= end)
            {
                endd=true;
            }

        }
        return ans;

    }
}