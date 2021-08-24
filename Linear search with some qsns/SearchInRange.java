package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {22,19,39,13,6,27};
        int target =27;
        System.out.println(linearSearchInRange(arr,1,4,target));
    }

    static int linearSearchInRange(int[] arr, int start, int end, int target) {
            if(arr.length==0)
                return -1;

        for (int i = start; i <=end ; i++) {
            if(arr[i]==target)
                return i;
        }
     return -1;
    }
}
