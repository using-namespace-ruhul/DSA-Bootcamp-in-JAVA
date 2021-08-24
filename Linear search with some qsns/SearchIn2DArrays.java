package com.company;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {23,4,1},
                        {18,12,33,16},
                        {11,19},
                        {6,9,27}
                };
        int target = 19;
        int[] answer_Index = searchIn1D(arr,target);
        System.out.println(Arrays.toString(answer_Index));
    }

    static int[] searchIn1D(int[][] arr, int target) {
        //int[] ans = new int[2];
        //if the array is empty.
        if(arr.length==0) {
//            ans[0] = -1;
//            ans[1] = -1;
//            return ans;
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                //If element is found.
                if(arr[row][column]==target) {
//                    ans[0] = row;
//                    ans[1] = column;
//                    return ans;
                    return new int[]{row,column};
                }
            }
        }
        //If element not found.
//    ans[0] = -1;
//    ans[1] = -1;
//    return ans;
      return new int[]{-1,-1};
    }
}
