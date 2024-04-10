class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map= new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String temp=strs[i];
            char[] arr=temp.toCharArray();;
            Arrays.sort(arr);
            String s=new String(arr);
            if(map.containsKey(s))
            {
                map.get(s).add(strs[i]);
            }
            else
            {
                map.put(s , new ArrayList<>());
                map.get(s).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}