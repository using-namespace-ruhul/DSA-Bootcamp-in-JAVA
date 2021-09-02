package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,1};
//        int[] arr = {1,2,3,4,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct_Index = arr[i] - 1;
            if(arr[i]!=arr[correct_Index]){
                swap(arr,i,correct_Index);
            }else{
                i++;
            }
        }
    }

//    static void cyclicSort(int[] arr) {
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]!=i+1){
//                swap(arr,i,arr[i]-1);
//                i=0;
//            }
//        }
//    }



    static void swap(int[] arr, int first_Index, int second_Index){
        int temp = arr[first_Index];
        arr[first_Index] = arr[second_Index];
        arr[second_Index] = temp;
    }


}
