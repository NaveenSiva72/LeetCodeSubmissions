class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int j=0;j<numRows;j++){
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<=j;i++){
                if(i==0 || i == j){
                    arr.add(1);
                }else{
                    arr.add(ans.get(j - 1).get(i - 1) + ans.get(j - 1).get(i));
                }
            }
            ans.add(arr);
        }
        return ans;
        
        
    }
}