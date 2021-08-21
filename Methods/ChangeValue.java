package com.company;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
        num[0] = 99;//here copy of the value of the reference is created.Here we are modifying the array.
    }//i.e both pointing to the same.
}
