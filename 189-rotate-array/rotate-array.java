class Solution {
    public void rotate(int[] arr, int k) {
        int length = arr.length;
        int starting = k%length;
        int[] temp = new int[length - starting];
        // int j=0;
        for(int i=0; i<(length - starting);i++){
            temp[i] = arr[i];
        }
        int j=length - starting;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
        for(int i=0;i<starting;i++){
            arr[i] = arr[j++];
        }
        System.out.println(Arrays.toString(arr));
        j=starting;
        for(int i=0;i<temp.length;i++){
            arr[j++]= temp[i];
        }

        

        
    }
}