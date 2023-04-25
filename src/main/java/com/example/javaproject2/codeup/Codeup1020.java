package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        System.out.printf("%s", num.substring(0, 6) + num.substring(7, 14));
    }
}
