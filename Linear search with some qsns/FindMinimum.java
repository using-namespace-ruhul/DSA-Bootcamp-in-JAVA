package com.company;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {22,-11,33,-44,-51,9,13};
        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr) {
        if(arr.length==0)
            return -1;

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
}
