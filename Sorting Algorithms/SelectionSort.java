package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {55,2,33,-7,44,11,-29,8,34,-13,55,-6,0,23,13};
        //int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with correct index.
            int last = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int findMaxIndex(int[] arr,int start, int last) {
        int max = start;
        for (int i = 0; i <= last ; i++) {
            if(arr[max]<arr[i])
                max = i;
        }
    return  max;
    }

    static void swap(int[] arr, int first_Index, int second_Index){
        int temp = arr[first_Index];
        arr[first_Index] = arr[second_Index];
        arr[second_Index] = temp;
    }
}
