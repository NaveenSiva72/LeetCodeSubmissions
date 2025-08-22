class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        int eleFre = 0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        eleFre = freq[s.charAt(0) - 'a'];
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0 && freq[i]!=eleFre){
                return false;
            }
        }
        return true;
        
    }
}