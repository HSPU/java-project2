package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("%d", num1 ^ num2); // XOR
    }
}