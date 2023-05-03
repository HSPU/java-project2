package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class IsPrime2 {
    public static void main(String[] args) {
        // 2부터 n - 1 까지만 check
        // i * i <= 50
        // break; num % i == 0이면

        int num = 991;
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
