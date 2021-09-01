package com.company;

public class CountRotations {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,0,1};
        System.out.println(findKRotation(arr));
    }

    public static int findKRotation(int[] arr) {
            int pivot = findPivot(arr);
        return pivot+1;
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        if(arr.length==1)
            return -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            else if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            else if(arr[mid]<=arr[start]){
                end = mid-1;
            }

            else if(arr[mid]>=arr[start]){
                start = mid+1;
            }
        }
        return -1;
    }
}
