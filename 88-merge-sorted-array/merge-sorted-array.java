class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int n1 = m - 1;
        int n2 = nums2.length - 1;
        m = nums1.length - 1;
        while(n1>=0 && n2>=0){
            if(nums1[n1]>nums2[n2]){
                nums1[m--] = nums1[n1];
                n1--;
            }else{
                nums1[m--] = nums2[n2];
                n2--;
            }
        }

        while(n2>=0){
            nums1[m--] = nums2[n2--];
        }


        
    }
}