class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int cookie=0;
        int ans=0;
        while(child<g.length && cookie<s.length)
        {
            if(g[child]<=s[cookie])
            {
                ans++;
                child++;
            }
            cookie++;
        }
        return ans;
    }
}