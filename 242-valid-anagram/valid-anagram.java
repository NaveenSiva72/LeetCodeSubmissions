class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        int[] sA = new int[26];
        int[] tA = new int[26];

        for(int i=0;i<s.length();i++){
            sA[s.charAt(i) - 'a'] = ++sA[s.charAt(i) - 'a'];
            tA[t.charAt(i) - 'a'] = ++tA[t.charAt(i) - 'a'];  
        }

        for(int i=0;i<26;i++){
            if(sA[i]!=tA[i]){
                return false;
            }
        }

        return true;
        
    }
}