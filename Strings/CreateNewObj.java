package com.company;

public class CreateNewObj {
    public static void main(String[] args) {
        String a = new String("Ruhul");
        String b = new String("Ruhul");

        System.out.println(a==b);//Different objects same value so false.
        System.out.println(a.equals(b));//Only compares the values.
    }
}
