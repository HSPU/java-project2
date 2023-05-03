package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        for (int i = 0; i < num4 - 1; i++) {
            num1 = (num1 * num2) + num3;
        }
        System.out.println(num1);
    }
}
