class Solution {
    public int[][] largestLocal(int[][] grid) {
        int length = grid.length;
        int[][] ans=new int[length - 2][length - 2];
        for(int i=0;i<length - 2;i++)
        {
            for(int j=0;j<length - 2;j++)
            {
                ans[i][j]=findMax(grid , i,j);
            }
        }
        return ans;
    }
    public int findMax(int[][] grid, int i , int j)
    {
        int max=Integer.MIN_VALUE;
        for(int row=i;row<(i+3);row++)
        {
            for(int col=j;col<(j+3);col++)
            {
                max=Math.max(max , grid[row][col]);
            }
        }
        return max;
    }
}