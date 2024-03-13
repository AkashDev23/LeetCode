class Solution {
    public void rotate(int[][] matrix) {
        // To rotate the matrix first we will take the transpose of the matrix then we will swap the first column with the last column hence giving the rotated image of the matrix.
        transpose(matrix);
        swapCol(matrix);
        
    }
    public void transpose(int mat[][]){
        for(int i=0; i<mat.length; i++){
            for(int j=i; j<mat.length; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
public void swapCol(int[][] mat){
    for(int i = 0; i < mat.length; i++){
        for(int j = 0, k = mat.length - 1; j < k; j++, k--){ // Swap columns across the middle
            int temp = mat[i][j];
            mat[i][j] = mat[i][k];
            mat[i][k] = temp;
        }
    }
}

}