package com.example.javaproject2.programmers;

import java.util.Scanner;

public class sumFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
