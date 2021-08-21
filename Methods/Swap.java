package com.company;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        swap(x,y);
        System.out.println(x+" "+y);
    }

    static void swap(int a, int b) {//The references copy is passed.i.e passed by value and made a copy.
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

}

