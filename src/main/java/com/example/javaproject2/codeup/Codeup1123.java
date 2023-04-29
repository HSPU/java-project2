package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numC = sc.nextInt();
        float numF = (float) 9 / 5 * numC + 32;

        System.out.printf("%.3f", numF);
    }
}
