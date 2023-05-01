package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int one = 0;
        int sum = 0;
        while (sum < num) {
            sum += ++one;
        }
        System.out.println(one);
    }
}
