class Solution {
    public String removeOuterParentheses(String s) {
        Queue<Character> arr = new LinkedList<>();

        int op= 0;
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')'){
                op--;
                if(op==0){
                    ans = ans + putIntoQueue(arr);
                }else{
                    arr.add(')');
                }
            }else{
                op++;
                 arr.add('(');
                
            }
        }
        return ans;    
    }
    
    public String putIntoQueue(Queue<Character> arr)
    {
        String ans = "";
        arr.poll();
        while (!arr.isEmpty()) { 
            char i = arr.poll();
            ans += i; 
        }
        return ans;
    }
}