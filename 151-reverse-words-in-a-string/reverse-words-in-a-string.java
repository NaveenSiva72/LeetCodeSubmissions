class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        int insertPosition = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ') {
                if (ans.charAt(ans.length() - 1) != ' ') {
                    ans.insert(ans.length(), ' ');
                } else {
                    continue;
                }

            }else{
                if(ans.length()>0 && ans.charAt((ans.length()-1)) == ' '){
                    insertPosition = ans.length();
                }
                ans.insert(insertPosition, s.charAt(i));
            }
            // System.out

        }
        return ans.toString().trim();

    }
}