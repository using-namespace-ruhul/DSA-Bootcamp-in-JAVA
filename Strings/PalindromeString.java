package com.company;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "ABCBA";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        int lo = 0;
        int hi = str.length()-1;
        while(lo<=hi){
            if(str.charAt(lo)!=str.charAt(hi)){
                return false;
            }
            lo++;
            hi--;
        }
    return true;
    }
}
