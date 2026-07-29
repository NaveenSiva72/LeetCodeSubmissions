class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] fi = new int[26];
        int[] se = new int[26];

        for(int i=0;i<s.length() && i<t.length();i++){
            fi[s.charAt(i)-'a'] = ++fi[s.charAt(i)-'a'];
            se[t.charAt(i)-'a'] = ++se[t.charAt(i)-'a'];
        }

        for(int i=0;i<26;i++){
            if(fi[i]!=se[i]){
                return false;
            }
        }
        return true;
        
        
    }
}