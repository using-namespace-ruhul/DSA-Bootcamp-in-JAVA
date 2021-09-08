package com.company;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("Ruhul"+1);//Turns 1 as a string.
        //System.out.println(new int[]{1,2,3});//Print the object.//Use the default print toString to print.
        System.out.println(Arrays.toString(new int[]{1,2,3}));//Use the toString of Arrays.
        System.out.println('a');
        System.out.println('a'+1);//turns a into 97(ASCII) then add 1.
        System.out.println((char)('a'+1));//turns a into 97(ASCII) then add 1 then type casts to char.
       // Integer num = new Integer(4);//Wrapper class.//to use all the obj. functions/methods.
    }
}
