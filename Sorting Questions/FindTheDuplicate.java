package com.company;

class FindTheDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct_Index = nums[i]-1;
            if(nums[correct_Index]!=nums[i]){
                swap(nums,i,correct_Index);
            }else{
                i++;
            }
        }
        
        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index+1){
                return nums[index];
            }
        }
    return 0;    
    }
    
    public static void swap(int[] arr, int first_Number, int second_Number){
        int temp = arr[first_Number];
        arr[first_Number] = arr[second_Number];
        arr[second_Number] = temp;
    }
}