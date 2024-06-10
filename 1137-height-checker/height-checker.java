class Solution {
    public int heightChecker(int[] heights) {
        int[] newHights = new int[heights.length];

        for(int i=0;i<heights.length;i++)
        {
            newHights[i]=heights[i];
        }

        Arrays.sort(newHights);
        int count=0;
        for(int i=0;i<newHights.length;i++)
        {
            if(newHights[i]!=heights[i])
            {
                count++;
            }
        }
        return count;
    }
}