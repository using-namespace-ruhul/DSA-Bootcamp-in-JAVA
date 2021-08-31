package com.company;

public class RBSwithDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,6,6,1,2,3};
        System.out.println(search(arr,3));
    }
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target)
                return true;

            //if right is sorted or left is unsorted
            if(nums[mid]<nums[end] || nums[mid]<nums[start]){
                if(target>nums[mid] && target<=nums[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
            //if right is unsorted or left is sorted
            else if(nums[mid]>nums[end] || nums[mid]>nums[start]){
                if(target>=nums[start] && target<nums[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            //if we reach upto this point that means we are encountering a case where start==mid==end;So we will ignore the duplicates.
            else
                end--;//or start++
        }
        return false;
    }
}
