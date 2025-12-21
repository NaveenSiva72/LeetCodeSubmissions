class Solution {
    public int maxArea(int[] height) {
        int st = 0;
        int end = height.length - 1;
        int max = 0;
        int curr =0;

        while(st < end){
            curr = Math.min(height[st],height[end]) * (end - st);
            max = Math.max(curr , max);
            if(height[st] < height[end]){
                st++;
            }else{
                end--;
            }
        }
        return max;
        
    }
}