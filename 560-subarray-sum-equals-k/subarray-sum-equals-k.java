import java.util.HashMap;

class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length; // take the size of the array
        
        int[] prefix = new int[n]; // make a prefix array to store prefix sum
        
        prefix[0] = arr[0]; // for element at index at zero, it is same
        
        // making our prefix array
        for(int i = 1; i < n; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        
        HashMap<Integer, Integer> mp = new HashMap<>(); // declare a HashMap
        
        int ans = 0; // to store the number of our subarrays having sum as 'k'
        
        for(int i = 0; i < n; i++) { // traverse from the prefix array
            if(prefix[i] == k) // if it already becomes equal to k, then increment ans
                ans++;
            
            // now, as we discussed find whether (prefix[i] - k) present in map or not
            if(mp.containsKey(prefix[i] - k)) {
                ans += mp.get(prefix[i] - k); // if yes, then add it our answer
            }
            
            mp.put(prefix[i], mp.getOrDefault(prefix[i], 0) + 1); // put prefix sum into our map
        }
        
        return ans; // and at last, return our answer
    }
}
