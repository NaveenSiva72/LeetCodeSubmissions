class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int n = s.length();
        int charInSection = 2 * (numRows - 1);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<numRows;i++){
            int index = i;
            while(index<n){
                res.append(s.charAt(index));
                if(i!=0 && i!=numRows-1){
                    int charInBetween = charInSection - i*2;
                    if(index+charInBetween < n){
                        res.append(s.charAt(index+charInBetween));
                    }
                }
                index+=charInSection;
            }
        }
        return res.toString();
    }
}