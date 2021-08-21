package com.company;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
//         float num = 23;//The destination type must be greater than the source type.
//        //int num2 = 23.33;//Error.
//         System.out.println(num);
//
//         //Type casting:
//         int num2 = (int)(23.44f);//It will only take the int part.
//        System.out.println(num2);
//
//        //Automatic type promotion:
//        int a = 257;
//        byte b = (byte)(a);//Since the max of byte is 256 so it will do 257 % 256 = 1.
//        System.out.println(b);
//
//        byte x = 40;
//        byte y = 50;
//        byte z = 100;
//        int d = x * y / z;//Promoting the entire(bytes x and y) operation x*y into int type since d is int.
//        System.out.println(d);
//
////        byte p = 50;
////        p = p * 2;//Error because whenever we do any byte evaluation it automatically converts the entire exp into int but here p is a byte which is < int.
//
//        int number = 'A';
//        System.out.println(number);

        //Rules:
        //1. All the bytes, shorts and chars are promoted to ints.
        //2. If any operation in the expression is long(greater) then all of them(that are smaller) will be  converted into the long.
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double res = (f * b) + (i / c) - (d - s);//float + int - double = double.
        System.out.println((f * b) + " " + (i / c) + " " + (d -s));
        System.out.println(res);
    }
}
