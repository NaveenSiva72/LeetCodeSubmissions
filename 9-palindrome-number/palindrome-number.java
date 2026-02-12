class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        String m = x+"";
        int st =0;
        int end = m.length() - 1;
        while(st<end){
            if(m.charAt(st)!=m.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        

        return true;


        
    }
}