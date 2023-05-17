package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // n1 * n2 배열 생성
        int[][] arr = new int[num1][num2];
        // 막대의 개수 num
        int num = sc.nextInt();
        // 막대의 길이 length

        // 0 이면 가로 1 이면 세로로 나열
        // x, y 좌표 입력
        for (int i = 0; i < num; i++) {
            int length = sc.nextInt();
            int row = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x - 1][y - 1] = 1;
            if (row == 0) {
                for (int j = 0; j < length; j++) {
                    arr[x - 1][j] = 1;
                }
            } else if (row == 1) {
                for (int j = x; j <= length; j++) {
                    arr[j][y - 1] = 1;
                }
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
