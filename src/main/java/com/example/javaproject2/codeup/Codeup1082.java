package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int hexVal = Integer.parseInt(num, 16);
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X\n", hexVal, i, hexVal * i);
        }
    }
}
