class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
            int m = currNum(strs[i]);
            if (max < m){
                max = m;
            }

        }
        return max;

    }

    public int currNum(String curr){
        int n = 0;
        for(int i=0;i<curr.length();i++){
            if(curr.charAt(i) - 'a' >= 0 && curr.charAt(i) - 'a' <= 26)
            {
                return curr.length();
            }else{
                n = (n * 10) + ((int)(curr.charAt(i) - '0'));
            }
        }
        return n;
        
    }
}