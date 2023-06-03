package com.example.javaproject2.programmers;

import java.util.Arrays;

public class ifChangeArr1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 50 && arr[i] % 2 != 0) arr[i] = arr[i] * 2;
            else if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] = arr[i] / 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
