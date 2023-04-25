package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numArr = sc.next().split("");
        System.out.printf("[%d]\n", Integer.parseInt(numArr[0]) * 10000);
        System.out.printf("[%d]\n", Integer.parseInt(numArr[1]) * 1000);
        System.out.printf("[%d]\n", Integer.parseInt(numArr[2]) * 100);
        System.out.printf("[%d]\n", Integer.parseInt(numArr[3]) * 10);
        System.out.printf("[%d]\n", Integer.parseInt(numArr[4]));
    }
}
