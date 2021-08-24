package com.company;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {23,4,1},
                        {18,12,33,16},
                        {11,19},
                        {6,9,27}
                };
        System.out.println(getMax(arr));
    }

    static int getMax(int[][] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                maximum = Math.max(arr[row][column],maximum);
            }
        }
     return maximum;
    }
}
