package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num <= 100 && num >= 90) {
            System.out.println("A");
        } else if (num <= 89 && num >= 70) {
            System.out.println("B");
        } else if (num <= 69 && num >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
