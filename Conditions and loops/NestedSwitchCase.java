package com.company;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter any number: ");
//        int day = in.nextInt();
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
        System.out.print("Enter empID: ");
        int empID = in.nextInt();
        System.out.print("Enter dept: ");
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Ruhul");
            case 2 -> System.out.println("Rehan");
            case 3 -> {
                System.out.println("Joginder");
                switch (department) {
                    case "IT" -> System.out.println("Dept is IT");
                    case "CSE" -> System.out.println("Dept is CSE");
                    case "ECE" -> System.out.println("Dept is ECE");
                }
            }
            default -> System.out.println("Enter a valid input!!");
        }
    }
}
