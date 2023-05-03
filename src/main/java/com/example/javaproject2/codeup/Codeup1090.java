package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        for (int i = 0; i < num3 - 1; i++) {
            num1 *= num2;
        }
        System.out.println(num1);
    }
}
