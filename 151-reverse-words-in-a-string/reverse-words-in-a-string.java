class Solution {
    public String reverseWords(String s) {
        StringBuilder curr = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int i=0;
        boolean chk = false;
        i = s.length() - 1;
        while(i >= 0){

            if(s.charAt(i)==' '){
                chk = true;
                i--;
                continue;
            }
            else if(chk){
                ans.append(" "+curr.reverse());
                curr.delete(0,curr.length());
                chk=false;
            }
            curr.append(s.charAt(i));
            i--;

        }
        if(curr.length()>0){
            ans.append(" "+curr.reverse());
        }
        return ans.toString().trim();

    }
}