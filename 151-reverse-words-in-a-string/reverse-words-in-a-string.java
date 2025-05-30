class Solution {
    public String reverseWords(String s) {
        int addCounter = 0;
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(addCounter == 0){
                    continue;
                }else{
                    addCounter = 0;
                    ans.insert(addCounter, ' ');
                }
                
            }else{
                ans.insert(addCounter++ , s.charAt(i));
            }
        }
        return ans.toString().trim();
        
    }
}