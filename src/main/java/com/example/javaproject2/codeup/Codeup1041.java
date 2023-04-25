package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char alpabet = sc.next().charAt(0);
        int num = (int) alpabet;
        char nextNum = (char) ++num;

        System.out.printf("%s", nextNum);
    }
}
