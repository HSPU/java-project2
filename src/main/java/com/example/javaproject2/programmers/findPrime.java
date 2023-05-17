package com.example.javaproject2.programmers;

public class findPrime {
    public static void main(String[] args) {
        String num[] = new String[10];
        int factors = 0;    // 약수의 개수

        for (int i = 2; i < num.length; i++) {
            if (num.length % i == 0) factors++;
        }
        System.out.println(factors);
    }
}
