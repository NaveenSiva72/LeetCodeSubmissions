class Solution {
    public boolean checkPowersOfThree(int n) {
        int ans = 0;
        int total = 0;
        int nn = n;
        while(n > 0)
        {
            int rem = n % 3;
            if(rem == 1 || rem == 0)
            {
                total = total + (int)((Math.pow(3,ans)) * rem);
            }
            ans++;
            n/=3;
        }
        return total == nn;
    }
}