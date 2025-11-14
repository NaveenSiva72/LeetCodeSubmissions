class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int j=0;j<numRows;j++){
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<=j;i++){
                
                if(i==0 || i == j){
                    arr.add(1);
                }else{
                    System.out.println(ans.get(j - 1)+ "inner") ;
                    arr.add(ans.get(j - 1).get(i - 1) + ans.get(j - 1).get(i));
                }
                System.out.println(arr +".  12");

            }
            System.out.println(arr);
            
            ans.add(arr);
            System.out.println(ans);
        }
        return ans;
        
        
    }
}