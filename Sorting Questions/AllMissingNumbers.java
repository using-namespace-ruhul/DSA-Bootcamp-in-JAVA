package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct_Index = nums[i]-1;
            if(nums[i]!=nums[correct_Index]){
                swap(nums,i,correct_Index);
            }else{
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0; j<nums.length; j++){
            if(j!=nums[j]-1){
                list.add(j);
            }
        }
        return list;
    }
    
    public static void swap(int[] arr, int first_Index, int second_Index){
        int temp = arr[first_Index];
        arr[first_Index] = arr[second_Index];
        arr[second_Index] = temp;
    }
}