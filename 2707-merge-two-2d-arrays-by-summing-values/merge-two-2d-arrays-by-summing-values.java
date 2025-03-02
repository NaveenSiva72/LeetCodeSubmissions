class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int firstArr = 0;
        int secondArr = 0;
        ArrayList<int[]> ans = new ArrayList<>();

        while (firstArr < nums1.length && secondArr < nums2.length){
            if(nums1[firstArr][0] < nums2[secondArr][0])
            {
                ans.add(nums1[firstArr]);
                firstArr++;
            }
            else if(nums1[firstArr][0] > nums2[secondArr][0])
            {
                ans.add(nums2[secondArr]);
                secondArr++;
            }
            else
            {
                nums2[secondArr][1] = nums1[firstArr][1] + nums2[secondArr][1]; 
                ans.add(nums2[secondArr]);
                secondArr++;
                firstArr++;
            }
        }

        if(firstArr == nums1.length)
        {
            while(secondArr < nums2.length){
                ans.add(nums2[secondArr++]);
            }
        }
        else
        {
            while(firstArr < nums1.length){
                ans.add(nums1[firstArr++]);
            }
        }

        int[][] arr= new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
        {
            arr[i]=ans.get(i);
        }

        return arr;  
    }
}