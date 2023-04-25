package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1046_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        float average = 0;
        int[] numArr = new int[3];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            sum += numArr[i];
            average = (float) sum / numArr.length;
        }
        System.out.printf("%d\n", sum);
        System.out.printf("%.1f\n", average);
    }
}
