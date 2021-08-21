package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {//when we dont know how many args are gonna be passed.
        fun(1,2,3,4,5,6,7,8,9);
        fun2(2,3,"Ruhul","rehan","leetcode");
    }

    private static void fun2(int i, int i1, String ...v) {
    }

    static void fun(int ...v){//Internally it is storing these in array.
        System.out.println(Arrays.toString(v));
    }
}
