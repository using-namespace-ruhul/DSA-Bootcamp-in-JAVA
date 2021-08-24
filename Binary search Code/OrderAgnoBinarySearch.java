package com.company;

public class OrderAgnoBinarySearch {
    public static void main(String[] args) {
        int[] arr = {90,75,18,15,11,7,5,1};
        System.out.println(orderAgnosticBinsarySearch(arr,18));
    }

    static int orderAgnosticBinsarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //Checking whether array is sorted in asc pr disc order.
        boolean isAsc = arr[start]<arr[end];
//        if(arr[start]<arr[end]){
//            isAsc = true;
//        }else{
//            isAsc = false;
//        }


        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


}
