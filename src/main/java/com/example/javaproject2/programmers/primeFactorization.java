package com.example.javaproject2.programmers;

public class primeFactorization {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1]; // 왜 n + 1인지
        // int idx = 0;

        while (n > 1) {
            if (n % divisor == 0) {
                arr[divisor] = divisor; // idx++ 과 divisor 의 차이는 무엇인지
                n /= divisor;
            } else {
                divisor++;
            }
        }
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) size++;
        }
        int[] answer = new int[size];
        int answerIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[answerIdx++] = arr[i];
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}