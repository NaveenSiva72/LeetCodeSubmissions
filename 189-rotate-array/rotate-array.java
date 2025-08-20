class Solution {
    public void rotate(int[] nums, int k) {
        // int length = arr.length;
        // int starting = k%length;
        // int[] temp = new int[length - starting];
        // for(int i=0; i<(length - starting);i++){
        //     temp[i] = arr[i];
        // }
        // int j=length - starting;
        // for(int i=0;i<starting;i++){
        //     arr[i] = arr[j++];
        // }
        // j=starting;
        // for(int i=0;i<temp.length;i++){
        //     arr[j++]= temp[i];
        // }  
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}