package com.company;

public class Max {
    public static void main(String[] args) {
        int[] arr = {11,2,7,4,13};
        System.out.println("The max element is: "+getMax(arr));
        System.out.println("The max element is: "+getMaxInRange(arr,1,4)+" in the range "+1+" and "+4);
    }

    static int getMaxInRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = 1; i <= end; i++) {
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
        }
     return max;
    }
}
