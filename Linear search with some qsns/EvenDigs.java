package com.company;

public class EvenDigs {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int count = 0;
        System.out.println(evenDig(nums));
    }

    static int evenDig(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int var = (int)(Math.floor(Math.log10(nums[i]))+1);
            if(var%2==0)
                count++;
        }
    return count;
    }

}
