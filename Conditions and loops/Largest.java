package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int res = (a>b)?((a>c)?a:c):((b>c)?b:c);
        int res2 = Math.max(a,b);//inbuilt function
        System.out.print("\n"+res+" "+res2);
    }
}
