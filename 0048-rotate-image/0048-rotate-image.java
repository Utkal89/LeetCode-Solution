class Solution {
    public void rotate(int[][] matrix) {
        int[][] mat = new int[matrix[0].length][matrix.length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
               mat[j][i]=matrix[i][j];
            }
        }
       // int left =0,right=matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            int left =0,right=matrix.length-1;
        while(left<right){
               int temp=mat[i][left];
               mat[i][left]=mat[i][right];
               mat[i][right]=temp;
               left++;
               right--;
        }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
               matrix[i][j]=mat[i][j];
            }
        }
    }
}