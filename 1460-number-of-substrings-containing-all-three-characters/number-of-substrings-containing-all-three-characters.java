class Solution {

    public int numberOfSubstrings(String s) {
        int[] lastPosition = new int[]{-1, -1, -1};
        int total = 0;
        for(int i=0;i<s.length();i++){
            lastPosition[s.charAt(i) - 'a'] = i;

            total += 1 + Math.min(lastPosition[0], Math.min(lastPosition[1],lastPosition[2]));

        }
        return total;
    }
}