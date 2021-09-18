package com.company;

public class In2DSorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(searchMatrix(matrix, 7));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        //For searching the potential row:
        int potential_row = searchForRow(matrix, target);
        if(potential_row != -1){
            return binarySearch(matrix[potential_row], target);
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target){
        int lo = 0;
        int hi = arr.length-1;

        while( lo <= hi){
            int mid = lo+(hi-lo)/2;

            if( target < arr[mid] ){
                hi = mid-1;
            }else if( target > arr[mid] ){
                lo = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }

    public static int searchForRow(int[][] matrix, int target){
        int s = 0;
        int e = matrix.length-1;
        int lc = matrix[0].length-1;

        while( s <= e){
            int m = s+(e-s)/2;

            if( target>=matrix[m][0] && target<=matrix[m][lc]){//if target can lie in this row
                return m;
            }else if( target<matrix[m][0]){//If target lies above this row.
                e = m-1;
            }else if( target>matrix[m][0]){//if target lies beneath this row.
                s = m+1;
            }
        }
        return -1;//If target cannot exist in the matrix.
    }
}
