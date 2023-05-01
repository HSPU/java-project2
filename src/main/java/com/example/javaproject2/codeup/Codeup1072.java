package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numArr = new int[n];
        for (int i = 0; i < numArr.length; i++) {
            int num = sc.nextInt();
            numArr[i] = num;
            System.out.println(num);
        }
    }
}