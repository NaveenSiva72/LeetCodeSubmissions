class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String ,Integer> map=new LinkedHashMap<>();
        for(String curr : arr)
        {
            map.put(curr , map.getOrDefault(curr , 0) + 1);
        }
        for(String curr : map.keySet())
        {
            if((map.get(curr)==1) && (--k==0))
            {
                return curr;
            }
        }
       
        return ""; 
    }
}