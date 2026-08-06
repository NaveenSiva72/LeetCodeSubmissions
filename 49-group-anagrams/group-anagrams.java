class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        StringBuilder curr = new StringBuilder("");
        int[] cou = new int[26];
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<strs[i].length();j++){
                cou[strs[i].charAt(j) - 'a'] = cou[strs[i].charAt(j) - 'a'] + 1;   
            }
            for(int j=0;j<26;j++){
                int a = (int)'a';
                for(int k=cou[j];k>0;k--){
                    Character b = (char)(a + j);
                    curr.append(b);
                    cou[j] = cou[j] - 1;
                }
            }
            String curr2= curr.toString();
            if(map.containsKey((curr2))){
                map.get(curr2).add(strs[i]);
                map.put(curr2, map.get(curr2));
            }else{
                List<String> sans = new ArrayList<>();
                sans.add(strs[i]);
                map.put(curr2, sans);
            }
            curr.setLength(0);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String i : map.keySet()){
            ans.add(map.get(i));
        }
        return ans;
    }
}