package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        // j j j-1
        // 1 1 0
        // 2 2 1
        // 2 1 2
        // 3 3 2
        // 3 2 1
        // 3 1 0
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}