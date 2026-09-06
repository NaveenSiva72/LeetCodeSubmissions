class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] arr = new int[26];
        HashMap<String , List<String>> map = new HashMap<>();
        StringBuilder key = new StringBuilder("");
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<strs[i].length();j++){
                arr[strs[i].charAt(j) - 'a'] = ++arr[strs[i].charAt(j) - 'a'];
            }

            for(int k=0;k<26;k++){
                if(arr[k]!=0){
                    while(arr[k]>0){
                        key.append((char)((k) + (int)('a')));
                        --arr[k];
                    }
                }

            }

            if(map.containsKey(key.toString())){
                map.get(key.toString()).add(strs[i]);
            }else
            {
                map.put(key.toString(), new ArrayList<>());
                map.get(key.toString()).add(strs[i]);

            }
            key.setLength(0);
        }

        List<List<String>> ans = new ArrayList<>();
        for(String k : map.keySet()){
            ans.add(map.get(k));

        }

        return ans;
        
    }
}