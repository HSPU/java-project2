package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1073_doWhile {                   // while, for, do while 없이 how?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        do {
            System.out.println(num);
            num = sc.nextInt();
        } while (num != 0);
    }
}
