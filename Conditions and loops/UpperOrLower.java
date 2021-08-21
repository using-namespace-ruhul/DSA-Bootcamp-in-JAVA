package com.company;

import java.util.Scanner;

public class UpperOrLower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);//trim() trims the extra space of the string.

        if(ch >= 'a' && ch <= 'z')
            System.out.println("Lower case");
        else
            System.out.println("Upper case");
    }
}
