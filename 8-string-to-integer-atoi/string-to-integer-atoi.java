class Solution {
    public int myAtoi(String s) {

        long ans = 0;
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int i=0;
        boolean minus = false;
        if(s.charAt(i)=='-'){
            minus = true;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }

        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                ans = (ans * 10) + (s.charAt(i) - '0');
                    if(minus && (ans*(-1) < Integer.MIN_VALUE)){
                        return Integer.MIN_VALUE;
                    }
                    else if(!minus && (ans > Integer.MAX_VALUE)){
                        return Integer.MAX_VALUE;
                    }
            }
            else{
                break;
            }
            i++;
        }

        if(minus){
            ans=ans*(-1);
        }
        return (int)ans;
        


        
    }
}