class Solution {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if(slen != tlen){
            return false;
        }

        int[] sarr = new int[26];
        int[] tarr = new int[26];

        for(int i=0;i<s.length();i++){
            sarr[s.charAt(i) - 'a'] = ++sarr[s.charAt(i) - 'a'];
            tarr[t.charAt(i) - 'a'] = ++tarr[t.charAt(i) - 'a'];
        }

        for(int i=0;i<26;i++){
            if(sarr[i] != tarr[i]){
                return false;
            }
        }

        return true;
        
    }
}