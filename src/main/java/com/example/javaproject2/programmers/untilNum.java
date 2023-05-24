package com.example.javaproject2.programmers;

import com.example.javaproject2.week2.day2.ArraysToString;

import java.util.Arrays;

public class untilNum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 7, 5};
        int n = 3;
        int[] arr1 = new int[n];


        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
