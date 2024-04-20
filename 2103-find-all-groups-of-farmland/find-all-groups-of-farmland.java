class Solution {
    public int[][] findFarmland(int[][] land) {
        ArrayList<int[]> ans=new ArrayList<>();
        for(int i=0;i<land.length;i++)
        {
            for(int j=0;j<land[i].length;j++)
            {
                if(land[i][j]==1)
                {
                    ans.add(findIndex(land , i , j));
                    makeVisited(ans.get(ans.size() - 1) , land);
                }
            }
        }
         int[][] dataArray = new int[ans.size()][4];
        for (int i = 0; i < ans.size(); i++) {
            dataArray[i] = ans.get(i);
        }
        return dataArray;
    }
    public void makeVisited(int[] currentArr , int[][] land)
    {
        for(int i=currentArr[0];i<=currentArr[2];i++)
        {
            for(int j=currentArr[1];j<=currentArr[3];j++)
            {
                land[i][j]=2;
            }
        }
    }
    public int[] findIndex(int[][] land  , int i , int j)
    {
        int[] ans=new int[4];
        ans[0]=i;
        ans[1]=j;
        while(i<land.length)
        {
            if(land[i][j]==0)
            {
                break;
            }
            i++;
        }
        i--;
        for(;j<land[i].length;j++)
        {
            if(land[i][j]==0)
            {
                break;
            }
        }
        ans[2]=i;
        ans[3]=j-1;        
        return ans;
    }
}