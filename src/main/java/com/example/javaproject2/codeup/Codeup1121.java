package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int remainder = num1 % num2;
        System.out.println(remainder);
    }
}
