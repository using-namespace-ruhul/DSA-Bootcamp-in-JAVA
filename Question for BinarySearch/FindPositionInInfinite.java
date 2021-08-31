package com.company;

public class FindPositionInInfinite {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
        System.out.println(forFindingTheElement(arr,10));
    }

    public static int[] forFindingTheRange(int[] arr,int target) {
        int start = 0;
        int end = 1;
        //int size = 2;

        while(true){
            if(target<=arr[end])
                break;
            else
            {
                start = end+1;
                end = (2*start)+1;
            }
//            int temp = start;
//            end = end+(2*((end-start)+1));
//            start = end+1;
        }
        return new int[]{start,end};
    }

    public static int forFindingTheElement(int[] nums, int target) {
        int[] arr = forFindingTheRange(nums,target);
        int start = arr[0];
        int end = arr[1];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
