package com.codebyme;

import java.util.Scanner;

public class Pairs {
    // positive integer k
    // ( i,j) pairs ->   i < j &&  arr[i] + arr[j] % k == 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array you want: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        //int arr[] = { 1,2,3,4,5,6};
        System.out.print("Now enter the number you wanna add in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();
        //int k = 5;
        if(n>1) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if ((i < j) && ((arr[i] + arr[j]) % k == 0)) {
                        System.out.print("[" + (arr[i]) + "," + (arr[j]) + "]");
                    }
                }
            }
        }
    }



}
