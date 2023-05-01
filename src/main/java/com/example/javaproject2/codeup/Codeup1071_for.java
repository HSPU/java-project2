package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1071_for {                   // while, for, do while 없이 how?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 0; num != 0; i++) {
            System.out.println(num);
            num = sc.nextInt();
        }
    }
}
