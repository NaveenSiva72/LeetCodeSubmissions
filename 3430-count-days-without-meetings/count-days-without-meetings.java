class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings , (a ,b) -> Integer.compare(a[0] , b[0]));

        int ans = 0;
        int max = 0;
        for(int i=0;i<meetings.length;i++){
            if(meetings[i][0] > max){
                ans += (meetings[i][0] - max - 1);
                max = meetings[i][1];
            }else if (meetings[i][1] > max){
                max = meetings[i][1];
            }
        }
        ans += (days - max);
        return ans;
    }
}