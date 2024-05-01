class Solution {
    public String reversePrefix(String word, char ch) {
        String ans="";
        if(!(word.contains(ch+"")))
        {
            return word;
        }
        int i=0;
        for(;i<word.length();i++)
        {
            ans=word.charAt(i)+ans;
            if(word.charAt(i)==ch)
            {
                break;
            }
            

        }
        ans=ans+word.substring(++i);
        return ans;
    }
}