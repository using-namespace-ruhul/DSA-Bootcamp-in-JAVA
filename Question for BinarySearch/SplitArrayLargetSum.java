package com.company;

public class SplitArrayLargetSum {
    public static void main(String[] args) {
          int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }

    public static int splitArray(int[] nums, int m) {

        int start = Integer.MIN_VALUE;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while(start<end){

            int mid = start+(end-start)/2;

            int sum = 0;
            int pieces = 1;
            for(int curr_element : nums){
                if(sum + curr_element > mid){//You can not continue with this subarry create a new one.
                    sum = curr_element;//creating new subarray from that element.
                    pieces++;//No. of pieces increased
                }else
                    sum += curr_element;//Adding into the subarray.
            }

            if(pieces <= m)
                end = mid;//reducing the mid to check for a lower sum subarray to increase the number of pieces.
            else
                start = mid+1;//increasing the mid to check for a larger sum subarray to decrease the number of pieces.
        }
        return end;//Or start.   since here end == start.
    }
}
