package com.example.javaproject2.programmers;

import javafx.scene.chart.ScatterChart;

import java.util.Arrays;

public class ArrStringLength {
    public static void main(String[] args) {
        String[] arr = {"We", "are", "the", "world!"};

        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }

        System.out.println(Arrays.toString(answer));
    }
}
