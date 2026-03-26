class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows>=1){
            ans.add(List.of(1));
        }
        if(numRows>=2){
            ans.add(List.of(1,1));
        }

        for(int i=2;i<numRows;i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1;j<=i/2;j++){
                curr.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }

            int pos;
            int rem;
            if(i%2==0){
                pos=(i/2)-1;
                // rem = pos;
            }else{
                pos=i/2;
            }

            while(pos >= 0){
                curr.add(curr.get(pos--));
            }
            ans.add(curr);
        }
        return ans;
        
    }
}