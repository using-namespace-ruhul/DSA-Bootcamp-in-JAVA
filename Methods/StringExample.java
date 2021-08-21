package com.company;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String message = greet(name);
        System.out.println(message);
        String what = "RUHUL";
        changeWhat(what);
        System.out.println(what);
    }

    static void changeWhat(String what) {//the copy of the value of the ref is passed.
        what = "WHATEVER";//here its not modifying the string what from main rather its actually creating a new object.
    }

    static String greet(String a){
        return a+" how are you";
    }

}
