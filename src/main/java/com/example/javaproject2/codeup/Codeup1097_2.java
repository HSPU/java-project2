package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1097_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] arr2 = arr;

        int n = sc.nextInt();

        for (int j = 0; j < n; j++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = 0; i < arr2.length; i++) {
                if (arr[x - 1][i] == 1) arr[x - 1][i] = 0;  // [10][0~18]
                else arr[x - 1][i] = 1;
            }
            for (int i = 0; i < arr2.length; i++) {
                if (arr[i][y - 1] == 1) arr[i][y - 1] = 0;  // [0~18][10]
                else arr[i][y - 1] = 1;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.printf("%d ", arr2[i][j]);
            }
            System.out.println();
        }
    }
}
