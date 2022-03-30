package com.codebyme;

import java.util.Arrays;
import java.util.Locale;

public class AnagramOrNot {
    public static void main(String[] args) {
        String listen = "Listen";
        String silent = "Silent";
        listen = listen.toLowerCase(Locale.ROOT);
        silent = silent.toLowerCase(Locale.ROOT);
        char []a = new char[listen.length()];
        char []b = new char[silent.length()];
        for (int i = 0; i < a.length; i++) {
         a[i] =   listen.charAt(i) ;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] =   silent.charAt(i) ;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] == b[j]){
                    count++;
                }
            }
        }
        if(count == b.length){
            System.out.println("Given String are anagrams of each other");
        }else{
            System.out.println("Given String are not anagrams of each other");

        }
    }
}
