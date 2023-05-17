package com.example.javaproject2.programmers;

public class evenSum {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 0; i <= n; i+=2) {
                sum += i;
                System.out.println(sum);
        }
    }
}
