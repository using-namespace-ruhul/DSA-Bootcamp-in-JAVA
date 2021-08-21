package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = in.nextInt();
//        //for loops:
//        for (int i = 1; i <= n ; i++) {
//            System.out.println(i);
//        }

        //while loops:
//          int i = 1;
//          while(i<=n){
//              System.out.println(i);
//              i++;
//          }

          //*** WE MOSTLY NEED TO USE FOR LOOP WHEN THE LIMIT IS KNOWN AND WHILE LOOP WHEN THE LIMIT IS UNKNOWN.

        //do-while loops.
         int i = 1;
          do{
              System.out.println("HIII");
          }while(i != n);
    }
}
