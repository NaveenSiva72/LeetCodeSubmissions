class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 0){
            return "";
        }
        int i=0;
        for(i=0;i<strs[0].length();i++){
            if (!chk(strs , strs[0].charAt(i), i)){
                return strs[0].substring(0,i);
            }
        }
        if(strs[0].length() == i){
            return strs[0];
        }
        return "";
    }
    public boolean chk(String[] strs , char c , int pos){
        for(int i=1;i<strs.length;i++){
            if(pos >= strs[i].length()){
                return false;
            }
            if (strs[i].charAt(pos)!=c){
                return false;
            }
        }
        return true;
    }
}