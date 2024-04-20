class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length==0)
        {
            return 0;
        }
        int i=0;
        int j=mat[0].length - 1;
        int sum=0;
        while(i<mat[0].length && j>=0)
        {
            if(i==j)
            {
                sum+=mat[i][i];
                i++;
                j--;
                continue;
            }
            sum+=mat[i][i];
            sum+=mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}