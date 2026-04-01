class Solution {
    public void rotate(int[][] matrix) {
        int st =0;
        int end =0;
        int temp =0;

        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            st=0;
            end=matrix.length - 1;
            while(st<end){
                temp = matrix[i][st];
                matrix[i][st] = matrix[i][end];
                matrix[i][end] = temp;
                st++;
                end--;

            }
        }

        
        
    }
}