package com.company;

public class String_builders {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch);//It is not copying again and again.
        }
        System.out.println(series);
        series.reverse();
        System.out.println(series);
    }
}
