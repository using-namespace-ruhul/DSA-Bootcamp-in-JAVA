package com.company;

public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88};
        System.out.println(arr[ceiling(arr,40)]);
    }

    public static int ceiling(int[] arr, int target){

        if(target > arr[arr.length-1])
            return -1;

        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(target==arr[mid])
                return mid;
            else if(target>arr[mid])
                s = mid+1;
            else
                e = mid-1;
        }
     return s;
    }
}
