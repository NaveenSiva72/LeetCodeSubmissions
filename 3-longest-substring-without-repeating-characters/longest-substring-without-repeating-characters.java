class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int ans = 0;
        int st = 0;
        for(int i=0;i<s.length();i++){
            // if(ans>=(s.length() - st + 1)){
            //     return ans;
            // }
            if(map.containsKey(s.charAt(i)) && (map.get(s.charAt(i)))>=st){
                
                st=map.get(s.charAt(i))+1;
               map.put(s.charAt(i),i);

            }else{
                map.put(s.charAt(i),i);
                ans = Math.max(ans , (i - st + 1));
            }
            System.out.println(ans +". "+i+". "+st);
            
        }
        return ans;
    }
}