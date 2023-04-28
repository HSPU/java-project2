package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numArr = new int[3];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            if (numArr[i] % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
