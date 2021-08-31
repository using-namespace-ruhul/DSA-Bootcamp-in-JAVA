package com.company;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1,0};
        System.out.println(findInMountainArray(arr,0));
    }

    public static int findInMountainArray(int[] mountainArr, int target) {
        int peak = findPeak(mountainArr);
        int last_Index = mountainArr.length-1;
        //for inc part
        int index_in_Increasing_part = forIncreasingOrder(mountainArr,target,0,peak);
        if(index_in_Increasing_part==-1){
            return forDecreasingOrder(mountainArr,target,peak+1,last_Index);
        }
        else
            return index_in_Increasing_part;
    }

    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){

            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1])
                end = mid;
            else
                start = mid+1;
        }
        return start;
    }

    public static int forIncreasingOrder(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }

    public static int forDecreasingOrder(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }

}
