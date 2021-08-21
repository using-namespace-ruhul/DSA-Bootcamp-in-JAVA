package com.company;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter an operator: ");
            char op = in.next().trim().charAt(0);
            int ans=0;
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();
                switch (op) {
                    case '+' -> ans = a + b;
                    case '-' -> ans = a - b;
                    case '*' -> ans = a * b;
                    case '/' -> ans = a / b;
                    default -> System.out.println("Invalid operation!!!");
                }
            }else if(op=='x' || op=='X')
                break;
//            else
//                System.out.print("Invalid operation!!!");
            System.out.print("The result is: "+ans);
        }
    }
}
