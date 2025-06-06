class Solution {
    public int distributeCandies(int n, int limit) {
        if (limit * 3 < n) {
            return 0;
        }
        // how many combination of 3 numbers that sum up to n but none of them exceed limit
        int res = 0;
        for (int i = Math.min(limit, n); i >= 0; i--) {
            // pick for the first num
            int n2 = n - i;
            if (n2 > limit * 2) continue;
            // how many combination of 2 numbers that sum up to n2 but none of them exceed limit
            int j = Math.min(limit, n2); // max we can pick from the second one
            // we need to do a binary search here
            int k = Math.max(0, n2 - j);
            res += j - k + 1;
        }
        return res;
    }
}