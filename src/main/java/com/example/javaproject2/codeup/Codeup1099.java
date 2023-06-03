package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // 오른쪽 좌표랑 비교를 해서 같으면 오른쪽 이동 다르면 아래로 이동
        int x = 1;
        int y = 1;
        int cnt = 0;

        while (cnt < 100) {
            if (arr[y][x] == 2) {
                arr[y][x] = 9;
                break;
            } else if (x < 9 && arr[y][x] == 0 && arr[y][x + 1] != 1) {
                arr[y][x++] = 9;
            } else if (x < 9 && arr[y][x] == 0 && arr[y][x + 1] == 1) {
                arr[y++][x] = 9;
            }
            cnt += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
