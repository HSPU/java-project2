package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        float triangle = (float) (num1 * num2) / 2;

        System.out.printf("%.1f\n", triangle);
    }
}
