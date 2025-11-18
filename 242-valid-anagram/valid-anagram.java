class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        int[] sA = new int[26];

        for(int i=0;i<s.length();i++){
            sA[s.charAt(i) - 'a'] = ++sA[s.charAt(i) - 'a'];
            sA[t.charAt(i) - 'a'] = --sA[t.charAt(i) - 'a'];  
        }

        for(int i=0;i<26;i++){
            if(sA[i]!=0){
                return false;
            }
        }

        return true;
        
    }
}