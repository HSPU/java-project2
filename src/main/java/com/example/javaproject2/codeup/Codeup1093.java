package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] answer = new int[23 + 1];

        for (int i = 0; i < size; i++) {
            answer[sc.nextInt()]++;     // 문제의 핵심
        }

        for (int i = 1; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}
