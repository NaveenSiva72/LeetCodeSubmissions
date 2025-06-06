class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0;
        int i=0;int j=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i] < nums2[j])
            {
                arr.add(nums1[i]);
                i++;
            }
            else
            {
                arr.add(nums2[j]);
                j++;
            }
        }
        if(j!=nums2.length)
        {
            while(j<nums2.length)
            {
                arr.add(nums2[j]);
                j++;
            }
        }
        else
        {
            while(i<nums1.length)
            {
                arr.add(nums1[i]);
                i++;
            }
        }
        int m=nums1.length;
        int n=nums2.length;
        if((m+n)%2==0)
        {
            ans=arr.get(((m+n)/2) - 1) + arr.get(((m+n)/2));
            return ans/2;
        }
        ans=arr.get((m+n)/2);
        return ans;
    }
}