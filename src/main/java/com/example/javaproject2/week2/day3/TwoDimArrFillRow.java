package com.example.javaproject2.week2.day3;

import java.util.Arrays;


public class TwoDimArrFillRow {

    public static void fillARow(int[][] arr, int rowNum) {
        arr[rowNum][0] = 1;
        arr[rowNum][1] = 1;
        arr[rowNum][2] = 1;
        arr[rowNum][3] = 1;
        arr[rowNum][4] = 1;
        printTwoDimArr(arr);
    }

    public static void printTwoDimArr(int[][] arr) {
        System.out.println(Arrays.toString(arr[0])); // 행 단위로 출력
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[0]));
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillARow(arr, 1);
        fillARow(arr, 2);
    }
}
