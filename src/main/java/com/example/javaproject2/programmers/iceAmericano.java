package com.example.javaproject2.programmers;

import java.util.Arrays;

public class iceAmericano {
    public static void main(String[] args) {
        int money = 5500;
        int ia = 5500;
        int[] arr = new int[2];

        arr[0] = money / ia;
        arr[1] = money % ia;

        System.out.println(Arrays.toString(arr));
    }
}
