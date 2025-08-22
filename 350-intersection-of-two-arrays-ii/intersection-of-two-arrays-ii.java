class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] arr = new int[1001];

        for(int i=0;i<nums1.length;i++){
            arr[nums1[i]]++;
        }

        int fre = 0;
        for(int i : nums2){
            if(arr[i]>0){
                nums1[fre++] = i;
                arr[i]--;
            }
        }

        return Arrays.copyOfRange(nums1,0,fre);
        
        
    }
}