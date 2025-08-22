class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] arr = new int[1001];

        for(int i=0;i<nums1.length;i++){
            arr[nums1[i]]++;
        }

        ArrayList<Integer> ans1 = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if(arr[nums2[i]] > 0){
                ans1.add(nums2[i]);
                arr[nums2[i]]--;
            }
        }

        int[] ans = new int[ans1.size()];
        for(int i=0;i<ans1.size();i++){
            ans[i]=ans1.get(i);
        }

        return ans;
        
    }
}