package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int idx = 0;

        for (int i = 0; i < size; i++) {            // i = 0 ~ 4 까지 증가
            arr[idx++] = sc.nextInt();              // idx++  10 20 30 40 50
        }

        for (int i = arr.length - 1; i >= 0; i--) {   // i = 4 ~ 0 까지 감소
            System.out.printf("%d ", arr[i]);
        }
    }
}
