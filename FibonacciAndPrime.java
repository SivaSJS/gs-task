package com.codebyme;

import java.util.Arrays;

public class FibonacciAndPrime {
    public static void main(String[] args) {
        int a = -1;
        int b = 1;
        int c = a + b;
        int j = 0;
        int[] d = new int[50];
        for (int i = 1; i <= 50; i++) {
            a = b;
            b = c;
            c = a + b;
            d[j++] = c;
        }
       // System.out.println(Arrays.toString(d));
        int count = 0;
        int val[] = new int[10];
        int kk = 0;
        int p[] = new int[10];
        int z = 0;
       // checking the condition prime
        for (int i = 0; i < d.length; i++) {
            if (primeOrNot(d[i])){
                p[z++] = d[i];
            }
        }
        System.out.println("prime and fibonacci number are " + Arrays.toString(p));

    }
// method for checking prime or not
    static boolean primeOrNot(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    // method for fibonacci


}

/*

*/




