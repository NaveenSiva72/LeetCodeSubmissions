class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        int max = 0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            max = Math.max(max, freq[s.charAt(i)-'a']);
        }
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0 && freq[i]!=max){
                return false;
            }
        }
        return true;
        
    }
}