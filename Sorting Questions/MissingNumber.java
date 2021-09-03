package com.company;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct_Index = nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correct_Index]){
                swap(nums,i,correct_Index);
            }else{
                i++;
            }
        }

        for(int j=0; j < nums.length; j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }

    public static void swap(int[] arr, int first_Index, int second_Index){
        int temp = arr[first_Index];
        arr[first_Index] = arr[second_Index];
        arr[second_Index] = temp;
    }
}
