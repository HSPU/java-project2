package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        float avarage = (float) sum / 3;

        System.out.println(sum);
        System.out.printf("%.1f", avarage);
    }
}
