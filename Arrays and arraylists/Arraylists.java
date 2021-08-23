package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//
//        System.out.println(list.contains(3));
//
//        list.set(2,100);
//        list.set(7,99);//@ index 7 replaces with 99.
//        System.out.println("Size= "+ list.size());
//        System.out.println(list);
//
//        list.remove(7);//index 7 removed
//        System.out.println("Size= "+ list.size());
//        System.out.println(list.get(4));//eqv to list[4].
//
//        System.out.println(list);//Here we dont need th Arrays.toString() explicitely since its using that internally.

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());//.add() inserts element @ the end of the list.
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}
