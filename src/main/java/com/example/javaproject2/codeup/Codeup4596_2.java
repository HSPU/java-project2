package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup4596_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xIndex = 0;             // x 인덱스
        int yIndex = 0;             // y 인덱스

        int minValue = 100;           // 최소값
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                int input = sc.nextInt();
                if (minValue > input) {
                    minValue = input;
                    xIndex = row;
                    yIndex = col;
                }
            }
        }
        System.out.println(minValue);
        System.out.printf("%d %d\n", xIndex, yIndex);
    }
}
