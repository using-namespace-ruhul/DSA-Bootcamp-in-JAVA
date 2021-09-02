package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {55,2,33,-7,44,11,-29,8,34,-13,55,-6,0,23,13};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;//because the left side is already sorted.
                }
            }
        }
    }

    static void swap(int[] arr, int first_Index, int second_Index){
        int temp = arr[first_Index];
        arr[first_Index] = arr[second_Index];
        arr[second_Index] = temp;
    }
}
