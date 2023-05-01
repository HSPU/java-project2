package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zero = 0;
        int num = sc.nextInt();

        System.out.println(zero);
        while (zero < num) {
            zero++;
            System.out.println(zero);
            if (zero == num) {
                break;
            }
        }
    }
}
