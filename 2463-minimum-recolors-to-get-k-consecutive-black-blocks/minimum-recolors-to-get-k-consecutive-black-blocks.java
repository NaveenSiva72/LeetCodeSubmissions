class Solution {
    public int minimumRecolors(String blocks, int k) {
        int action = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length() - k;i++)
        {
            int curr = i;
            int count = 1;
            System.out.println("initial"+ action);
            while(curr < blocks.length() && count++ <= k )
            {
                if(blocks.charAt(curr) == 'W'){
                    action++;
                }
                curr++;
                System.out.println("inner"+action);
            }
            System.out.println(action);
            if(action < ans){
                ans = action;
            }
            action = 0;
        }

        // for(int i=blocks.length() - 1;((i+1)-k)>=0;i--)
        // {
        //     int curr = i;
        //     // System.out.println(i);
        //     // System.out.println(curr);
        //     while(curr >= 0)
        //     {
        //         if(blocks.charAt(curr) == 'W'){
        //             action++;
        //         }
        //         curr--;
        //     }
        //     if(action < ans){
        //         ans = action;
        //     }
        //     System.out.println(action);
        //     action = 0;
        // }
        return ans;
    }
}