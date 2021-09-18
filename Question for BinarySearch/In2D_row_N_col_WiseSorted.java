package com.company;

public class In2D_row_N_col_WiseSorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        System.out.println(searchMatrix(matrix, 7));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row_len = matrix[0].length;
        int col_len = matrix.length;

        int row = 0;
        int col = row_len-1;

        while(row<col_len && col>=0){
            if(matrix[row][col]<target){
                row++;
            }else if(matrix[row][col]>target){
                col--;
            }else{
                return true;
            }
        }
        return false;
    }
}
