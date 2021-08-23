package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Array of primitives.
        int[] arr = new int[6];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");//1
        }
        System.out.println();

        for (int j : arr) {//for every element in array print the element. j is iterator.
            System.out.print(j + " ");//2
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));//3

         */

        //Array of objects
        String[] str = new String[5];

        for (int i = 0; i <str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
