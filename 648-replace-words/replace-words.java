class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String ans="";
        HashSet<String> set=new HashSet<>(dictionary);
        for(String curr : sentence.split(" "))
        {
            String temp="";
            boolean changed=false;
            for(char currentChar : curr.toCharArray())
            {
                temp+=currentChar;
                if(set.contains(temp))
                {
                    
                    ans=ans +" "+temp;
                    changed=true;
                    break;
                }
            }
            if(!(changed))
            {
                ans=ans +" "+curr;  
            }
        }
        return ans.trim();

    }
}