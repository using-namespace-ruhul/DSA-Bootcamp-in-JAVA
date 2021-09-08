package com.company;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series += ch;//Here in every step first a new object is created every time because strings are immutable in java then its copying the prev one again then the new char is appended. Which leads to O(n^2) TC. And wastage of space too.
        }
        System.out.println(series);
    }
}
