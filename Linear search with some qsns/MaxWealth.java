package com.company;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int total_wealth_of_each = 0;
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<accounts.length; row++){
            for(int col = 0; col<accounts[row].length; col++){
                total_wealth_of_each += accounts[row][col];
            }
            max = Math.max(max,total_wealth_of_each);
            total_wealth_of_each = 0;
        }
        return max;
    }
}
