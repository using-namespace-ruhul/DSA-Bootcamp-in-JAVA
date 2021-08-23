package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
//        System.out.println();
//        System.out.println(Arrays.toString(array));
        int[][] arr2d = new int[3][4];//length = 3 i.e. no of rows
        for(int i=0; i<arr2d.length;i++){
            for(int j=0; j<arr2d[i].length; j++){
                arr2d[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<arr2d.length;i++){
            for(int j=0; j<arr2d[i].length; j++){
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < arr2d.length; i++) {
            System.out.println(Arrays.toString(arr2d[i]));
        }

    }
}
