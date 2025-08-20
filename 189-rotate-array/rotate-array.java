class Solution {
    public void rotate(int[] arr, int k) {
        int length = arr.length;
        int starting = k%length;
        int[] temp = new int[length - starting];
        for(int i=0; i<(length - starting);i++){
            temp[i] = arr[i];
        }
        int j=length - starting;
        for(int i=0;i<starting;i++){
            arr[i] = arr[j++];
        }
        j=starting;
        for(int i=0;i<temp.length;i++){
            arr[j++]= temp[i];
        }  
    }
}