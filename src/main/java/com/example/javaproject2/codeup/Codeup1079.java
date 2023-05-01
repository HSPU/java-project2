package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char str = sc.next().charAt(0);
        System.out.println(str);
        while (str != 'q') {
            str = sc.next().charAt(0);
            System.out.println(str);
        }
    }
}
