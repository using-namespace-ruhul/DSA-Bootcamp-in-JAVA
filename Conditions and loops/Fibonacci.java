package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the fib index: ");
        int n = in.nextInt();
        int a = 0, b = 1, count = 2;
        //int res=0;
        while(count <= n){
            int temp = a;
            a = b;
            b += temp;
            count++;
        }
        System.out.println("The "+n+"th fibonacci term is: "+ b);
    }
}
