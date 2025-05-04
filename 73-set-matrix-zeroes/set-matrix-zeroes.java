class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0){return ;}

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int[] row = new int[rowLen];
        int[] col = new int[colLen];

        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        setMatrixToZero(matrix, rowLen, colLen, row, col);

    }
    public void setMatrixToZero(int[][] matrix, int rowLen, int colLen, int[] row, int[] col)
    {
        for(int i=0;i<rowLen;i++){
            if(row[i]==1){
                for(int j=0;j<colLen;j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i=0;i<colLen;i++){
            if(col[i]==1){
                for(int j=0;j<rowLen;j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}