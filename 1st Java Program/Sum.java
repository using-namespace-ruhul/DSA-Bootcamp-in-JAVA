package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println("The sum is = " + (num1+num2));
    }
}
