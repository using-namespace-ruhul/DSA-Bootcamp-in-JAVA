package com.company;

public class PrettyPrinting {
    public static void main(String[] args) {
        float f =  43.5432f;
        System.out.printf("Formatted number is %.2f", f);//prints decimal val upto 2 places.
        System.out.println();
        System.out.printf("%.3f", Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I am %s", "Ruhul", "cool");
    }
}
