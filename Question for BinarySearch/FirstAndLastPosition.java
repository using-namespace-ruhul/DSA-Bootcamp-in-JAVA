package com.company;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {11,22,22,22,22,22,22,22,22,22,22,22,33,44,55,66,77,88};
        System.out.println(Arrays.toString(searchRange(arr,22)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] arr = {-1,-1};

        arr[0] = findRange(nums,target,true);
        arr[1] = findRange(nums,target,false);

        return arr;
    }

    public static int findRange(int[] arr, int target, boolean finding_First_Occurence){

        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target==arr[mid]){//potential answer found.
                ans = mid;
                if(finding_First_Occurence)//checking if there are element in the left.
                    end = mid-1;
                else//checking if there are element in the right.
                    start = mid+1;
            }
            else if(target<arr[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return ans;
    }
}
