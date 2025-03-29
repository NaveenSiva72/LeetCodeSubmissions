class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> map1 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                if(map1.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                if(map1.containsValue(t.charAt(i))){
                    return false;
                }else{
                    map1.put(s.charAt(i) , t.charAt(i));
                }
            }

        }
        return true;
    }

}