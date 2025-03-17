class Solution {
    public int findGCD(int[] nums) {
        int max =nums[0];
        int min=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<min)
            {
                min=nums[i];
            
            }else if(nums[i]>max){
                max=nums[i];
                
            }
        }
        return gcd(min,max);
    }

    public int gcd(int min,int max){
        if(max%min==0){
            return min;
        }
        int temp=min;

        while(temp-- > 0){
            if(min%temp==0 && max%temp==0){
                return temp;
            }
        }
        return 1;  
    }
}