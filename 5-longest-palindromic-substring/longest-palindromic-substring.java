class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(ans.length() >= (s.length() - i + 1)){
                return ans.toString();
            }
            for(int j=s.length() - 1;j>=i;j--){
                if(isPalindrom(i,j,s) && (ans.length() < s.substring(i,j+1).length())){
                    ans.setLength(0);
                    ans.append(s.substring(i, j+1));
                    break;
                }
            }
        }
        return ans.toString();
    }
    public boolean isPalindrom(int st , int end , String s){
        while(st<end){
            if(s.charAt(st++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}