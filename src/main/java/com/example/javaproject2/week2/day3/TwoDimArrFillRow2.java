package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][2] = 1; // 0행 2열에 값 할당
        arr[1][2] = 1; // 1행 2열에 값 할당
        arr[2][2] = 1; // 2행 2열에 값 할당
        arr[3][2] = 1; // 3행 2열에 값 할당
        arr[4][2] = 1; // 4행 2열에 값 할당

        System.out.println(Arrays.toString(arr[0])); // 행 단위로 출력
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[0]));
    }
}
