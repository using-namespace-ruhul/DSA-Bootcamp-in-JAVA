package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {55,2,33,-7,44,11,-29,8,34,-13,55,-6,0,23,13};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){//If the item is smaller than the previous item.
                    //swap
                    swap(arr,j,j-1);
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
