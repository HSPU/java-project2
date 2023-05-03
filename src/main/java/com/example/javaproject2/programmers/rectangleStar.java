package com.example.javaproject2.programmers;

import java.util.Scanner;

public class rectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int j = 0; j < num2; j++) {
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
