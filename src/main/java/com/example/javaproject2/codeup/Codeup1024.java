package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArr = str.split("");

        for (int i = 0; i < strArr.length; i++) {
            System.out.printf("'%s'\n", strArr[i]);
        }
    }
}
