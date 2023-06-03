package com.example.javaproject2.programmers;

import java.util.Arrays;

public class lastTwoThings {
    public static void main(String[] args) {
        int[] arr = {2, 1, 6};

        int[] arr2 = new int[arr.length + 1];

        if (arr[arr.length - 2] < arr[arr.length - 1]) arr2[arr.length] = arr[arr.length - 1] - arr[arr.length - 2];
        else arr2[arr.length] = arr[arr.length - 1] * 2;

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
