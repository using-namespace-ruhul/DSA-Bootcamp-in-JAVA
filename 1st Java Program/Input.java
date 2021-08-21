package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any input: ");
        int a = input.nextInt();
        System.out.println("The input is: " + a);
    }
}
