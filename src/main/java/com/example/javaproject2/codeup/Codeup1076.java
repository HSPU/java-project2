package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char one = 'a';
        char num = sc.next().charAt(0);

        System.out.printf("%s ", one);
        while (one < num) {
            ++one;
            System.out.printf("%s ", one);
            if (one == num) {
                break;
            }
        }
    }
}
