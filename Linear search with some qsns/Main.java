package com.company;

public class Main {

    public static void main(String[] args) {
         int[] arr = {22,19,39,13,6,27};
         int target =10;
        System.out.println(linearSearch(arr,target));
    }

    //search in the array, if found then return the index.
    //if not found then return -1.
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0)
            return -1;

        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target)
                return index;
        }
        return -1;
    }
}
