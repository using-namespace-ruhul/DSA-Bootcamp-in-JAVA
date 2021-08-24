package com.company;

import java.util.Arrays;

public class SearchinStrings {
    public static void main(String[] args) {
          String name = "Ruhul";
          char target = 'l';
        System.out.println(Arrays.toString(name.toCharArray()));
          if(search2(name,target))
              System.out.println("Present");
          else
              System.out.println("Not present");
    }

    static boolean search2(String str, char target){
        if(str.length()==0)
            return false;

       for(char ch: str.toCharArray()){
           if(ch==target)
               return true;
       }
        return false;
    }

    static boolean search(String str, char target){
        if(str.length()==0)
            return false;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target)
                return true;
        }
    return false;
    }
}
