package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zero = 0;
        int num = sc.nextInt();
        int sum = 0;

        while (zero < num) {
            zero++;
            if (zero % 2 == 0) {
                sum += zero;
            } else if (zero == num) {
                break;
            }
        }
        System.out.println(sum);
    }
}
