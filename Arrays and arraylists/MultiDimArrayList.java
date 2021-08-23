package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();//Declaration but not initialised since each of the row is still null doesn't have the capacity to contain any llist.

        //Initialisation
        for (int i = 0; i < 3; i++) {//for three rows
            list.add(new ArrayList<>());//Initialising for arraylist at each row.
        }

        //Taking input. for 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);

    }
}
