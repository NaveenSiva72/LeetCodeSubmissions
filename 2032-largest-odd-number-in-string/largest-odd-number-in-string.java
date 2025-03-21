class Solution {
    public String largestOddNumber(String num) {
        // long ans = 0;
        // long curr = 0;
        // for(int i=0;i<num.length();i++){
        //     int currValue = num.charAt(i) - '0';
        //     if(currValue%2 == 1){
        //         curr = (curr*10) + currValue;
        //         if(curr > ans){
        //             ans = curr;
        //         }

        //     }else{
        //         curr = 0;
        //     }
        // }
        // if(ans == 0){
        //     return "";
        // }
        // return ans+"";

        for(int i=num.length() - 1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
            
        }
        return "";
    }
}