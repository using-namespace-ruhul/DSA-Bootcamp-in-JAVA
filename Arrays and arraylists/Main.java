package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ros;///declaration of array. ros is getting defined in stack.
        ros = new int[5];//Initialisation: actually here object is created in the heap memo.
        System.out.println(ros[0]);//by default every element is 0.

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
           str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));//By default, every element is null.
    }
}
