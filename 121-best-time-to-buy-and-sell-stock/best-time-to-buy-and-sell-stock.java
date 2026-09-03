class Solution {
    public int maxProfit(int[] p) {
        int pro = 0;
        int d = p[0];
        for(int i=1;i<p.length;i++){
            int currPro = p[i] - d;
            if( currPro > 0){
                if(currPro > pro){
                    pro = currPro;
                }
               

            }else{
                d=p[i];
            }
        }
        return pro;
        
    }
}