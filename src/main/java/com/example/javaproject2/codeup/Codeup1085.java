package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();

        float Byte = (h * b * c * s) / 8;
        float mb = Byte / 1024 / 1024;
        System.out.printf("%.1f MB", mb);
    }
}
