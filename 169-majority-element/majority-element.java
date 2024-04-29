class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> arr=new HashMap<>();
        // int max=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     arr.put(nums[i] , arr.getOrDefault(nums[i] , 0) + 1);
        // }
        // // int ori=0; 
        // // for(Integer i : arr.keySet())
        // // {
        // //     if(max < arr.get(i))
        // //     {
        // //         ori=i;
        // //         max=arr.get(i);
        // //     }
        // // }
        // return ori;

        //by using hashmap
        // HashMap<Integer,Integer> arr=new HashMap<>();
        // int max=nums.length/2;
        // for(int i=0;i<nums.length;i++)
        // {
        //     arr.put(nums[i] , arr.getOrDefault(nums[i] , 0) + 1);
        //     if(arr.get(nums[i]) > max)
        //     {
        //         return nums[i];
        //     }
        // }
        // return -1;


        //moore algotithm..............................
        int curr=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                curr=nums[i];
            }
            if(curr!=nums[i])
            {
                count--;
            }
            else
            {
                count++;
            }
        }
        return curr;

    }
}