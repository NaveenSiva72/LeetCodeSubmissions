class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length ; j++)
            {
                if(grid[i][j]=='1')
                {
                    makeVisited(grid , i , j);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void makeVisited(char[][] grid , int i , int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0' || grid[i][j]=='2')
        {
            return;
        }
        grid[i][j]='2';
        
        makeVisited(grid , i-1 , j);
        makeVisited(grid , i+1 , j);
        makeVisited(grid , i , j-1);
        makeVisited(grid , i , j+1);

        return;
    }
}