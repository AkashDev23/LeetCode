class Solution {
    public void setZeroes(int[][] matrix) {
        //First make a new matrix of the same length as the original matrix and set all the rows and columns of where the zero occurs to 1.(You could choose any number I have choosed 1.
        int arr[][]=new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    for(int k=0; k<matrix.length; k++){
                        arr[k][j]=1;
                    }
                    for(int k=0; k<matrix[0].length; k++){
                        arr[i][k]=1;              }
                }
            }
        }
        //Now for any element in this new matrix is 1 set those elements of the original matrix to 0
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(arr[i][j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}