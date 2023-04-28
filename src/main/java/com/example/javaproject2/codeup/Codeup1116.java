package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int minus = num1 - num2;
        int multiple = num1 * num2;
        int division = num1 / num2;
        System.out.printf("%d+%d=%d\n", num1, num2, sum);
        System.out.printf("%d-%d=%d\n", num1, num2, minus);
        System.out.printf("%d*%d=%d\n", num1, num2, multiple);
        System.out.printf("%d/%d=%d\n", num1, num2, division);
    }
}
