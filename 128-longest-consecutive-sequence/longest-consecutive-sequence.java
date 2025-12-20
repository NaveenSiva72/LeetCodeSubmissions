// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length == 0)
//         {
//             return 0;
//         }
//         HashSet<Integer> set = new HashSet<>();
//         HashSet<Integer> remo = new HashSet<>();
//         int ans=1;
//         for(int i=0;i<nums.length;i++)
//         {
//             set.add(nums[i]);
//         }
//         while(set.size()!=0)
//         {
//             Iterator it = set.iterator();
//             int curr =(int) it.next();
//             if(!(set.contains(curr - 1)) && !(remo.contains(curr - 1)))
//             {
//                ans=Math.max(ans , chkInTheDecreasingOrder(set, remo , curr));
//             }else{
//                 remo.add(curr);
//                 set.remove(curr);
//             }
//             // System.out.println(curr +"curr");
//             // System.out.println(remo +"remo");
//             // System.out.println(set +"set");
//             // System.out.println(ans +"ans");
//         }
//         return ans;
//     }
//     public int chkInTheDecreasingOrder(HashSet<Integer> set, HashSet<Integer> remo , int currentNum)
//     {
//         int inc=0;
//         // currentNum;
//         while(set.remove(currentNum) || remo.remove(currentNum))
//         {
//             inc++;
//             currentNum++;
//         }

//         return inc;
//     }
// }

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int i : nums)
        {
            map.add(i);
        }
        int curr=1;
        int next=0;
        int ans=0;
        for(Integer i : map)
        {
            if(!(map.contains(i-1)))
            {
                next=i+1;
                curr=1;
                while(map.contains(next))
                {
                    curr++;
                    next=next+1;
                }
                ans=Math.max(curr , ans);
            }
        }
        return ans;
    }
}