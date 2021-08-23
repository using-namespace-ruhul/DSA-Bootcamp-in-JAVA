package com.company;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println("Before swapping:");
//        System.out.println(Arrays.toString(arr));
//        swap(arr,0,4);
//        System.out.println("After swapping:");
//        System.out.println(Arrays.toString(arr));
        System.out.println("Before reversing:");
        System.out.println(Arrays.toString(arr));
        rev(arr);
        System.out.println("After swapping:");
        System.out.println(Arrays.toString(arr));
    }

    private static void rev(int[] arr) {
         int lo = 0;
         int hi = arr.length-1;
         while(lo<hi){
             swap(arr,lo,hi);
             lo++;
             hi--;
         }
    }


    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
