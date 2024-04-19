class Solution {
    public int singleNumber(int[] arr) {
        for (int i=0;i<arr.length -1;i++){
           arr[i+1]=arr[i]^arr[i+1];
        } 
        return arr[arr.length - 1];
    }
}