class Solution {
    public boolean checkPerfectNumber(int num) {
        int endPoint = num/2;
        int sum =0 ;
        for(int i=1;i<=endPoint; i++)
        {
            if(num%i==0)
            {
                sum += i;
            }
        }
        return sum == num;
        
    }
}