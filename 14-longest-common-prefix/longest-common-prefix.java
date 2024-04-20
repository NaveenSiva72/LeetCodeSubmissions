class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder(strs[0]);
        while(ans.length()!=0)
        {
            int i=1;
            for( ;i<strs.length;i++)
            {
                if( (ans.length()>strs[i].length()) || !((strs[i].substring(0,ans.length())).equals(ans+"")))
                {
                    ans.deleteCharAt(ans.length() - 1);
                    break;
                }
            }
            if(i==strs.length)
            {
                return ans+"";
            }
        }

        return "";
    }
}