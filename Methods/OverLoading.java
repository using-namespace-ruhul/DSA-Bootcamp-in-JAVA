package com.company;

public class OverLoading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Kunal Kushwaha");
        int ans = sum(3, 4, 78);
        System.out.println(ans);
    }

    static int sum(int a, int b) {//either no. of args or the type of args must be diff.
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
