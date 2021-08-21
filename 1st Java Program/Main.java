package com.company;//The folder in which the java file lies.
// Sometimes we need to provide some sort of rules.
// e.g.-this file or function should only be accessed by files inside this package.

import java.util.Scanner;

public class Main {//the name of a class must start with a capital.
//1. Public means this class can be accessed from anywhere.
//2. Class is just a name of group of properties and functions.
    public static void main(String[] args) {//Functions in classes are called method.
        //1. Void is the return type.
        //2. Static means this function doesn't need any object of the Main class to be executed since it is the first.
        //3. program always starts from main function it is the must.
        System.out.println(123);
        System.out.println("why");
        Scanner input = new Scanner(System.in);
        // System.out means the commandline(as output screen)
        // System.in means the keyboard.
        System.out.println(input.nextLine());
    }
}
