package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[] arr = new int[5];
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void change(int[] array) {
        array[0] = 99;
    }
}
