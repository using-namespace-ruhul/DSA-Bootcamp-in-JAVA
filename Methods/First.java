package com.company;

import java.util.Scanner;

public class First {//IN JAVA WE CALL FUNCTIONS --> METHOD

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        System.out.println("The sum of "+num1+" and "+num2+" is: "+sum(num1,num2));
    }

    static int sum(int a, int b) {
       return a+b;
    }
}
