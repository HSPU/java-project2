package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            System.out.println("Hello");
        } while(num != 0);
    }
}