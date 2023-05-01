package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);

        while (num > 1) {
            --num;
            System.out.println(num);
        }
    }
}
