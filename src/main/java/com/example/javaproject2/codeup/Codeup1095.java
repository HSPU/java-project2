package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int index = 0;

        for (int i = 0; i < size; i++) {
            arr[index++] = sc.nextInt();      // 문제의 핵심
        }

        int minValue = arr[0];                // 멘토님이 말씀하신 부분
        for (int i = 0; i < size; i++) {
            if (minValue > arr[i]) minValue = arr[i];
        }
        System.out.printf("%d", minValue);
    }
}
