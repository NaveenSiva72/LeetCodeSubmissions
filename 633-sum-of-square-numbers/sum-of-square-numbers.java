class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=0 ; i<=Math.sqrt(c);i++)
        {
            int a=i*i;
            boolean isInt=chkIsPerfectSquare(Math.sqrt(c - a));
          
            if(isInt)
            {
                return true;
            }
        }
        return false;
    }
    public boolean chkIsPerfectSquare(double num)
    {
        return ((int) num == num);
    }
}