package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt() % sc.nextInt();

        System.out.printf("%d", num);
    }
}
