package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int minute = num / 60;
        int second = num % 60;

        System.out.printf("%d %d", minute, second);
    }
}
