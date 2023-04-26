package com.example.javaproject2.week2.day3;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int firstRemainder = num % 10;      // 7
        num = num / 10;                     // num = 68
        int secondRemainder = num % 10;     // 8
        num = num / 10;                     // num = 6
        int thirdRemainder = num % 10;      // 6

        System.out.println(firstRemainder + secondRemainder + thirdRemainder);
    }
}
