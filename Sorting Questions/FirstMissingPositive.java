package com.company;

class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct_Index = nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[correct_Index]!=nums[i]){
                swap(nums,i,correct_Index);
            }else{
                i++;
            }
        }
        
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
    return nums.length+1;
    }
    
    public static void swap(int[] arr, int first_Index, int second_Index){
        int temp = arr[first_Index];
        arr[first_Index] = arr[second_Index];
        arr[second_Index] = temp;
    }
}