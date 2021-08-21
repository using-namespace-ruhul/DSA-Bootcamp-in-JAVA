package com.company;

import java.util.Scanner;

public class Occurances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        long n = in.nextLong();
        System.out.print("Enter the number of which occurence is to be found: ");
        int k = in.nextInt(), count = 0;
        while(n!=0){
            int temp = (int)n%10;
            if(temp==k)
                count++;
            n/=10;
        }
        System.out.println("The number of occurences of " +k+ " in " +n+ " is: "+ count);
    }
}
