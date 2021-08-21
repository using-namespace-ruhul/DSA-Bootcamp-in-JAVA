package com.company;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salary = in.nextInt();

        if(salary < 20000){
            salary+=2000;
        }else if(salary >20000 && salary < 40000){
            salary+=4000;
        }
        else{
            salary+=100000;
        }
        System.out.println(salary);
    }
}
