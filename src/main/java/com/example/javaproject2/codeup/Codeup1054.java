package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("0");
        } else if (num1 == num2) {
            System.out.println("1");
        }
    }
}
