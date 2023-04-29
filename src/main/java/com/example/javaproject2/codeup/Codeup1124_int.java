package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1124_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int index 이용
        String str = sc.next();

        int index1 = str.indexOf("C");
        int index2 = str.indexOf("H");
        String str1 = str.substring(index1 + 1, index2);
        String str2 = str.substring(index2 + 1);

        System.out.println(Integer.parseInt(str1) * 12 + Integer.parseInt(str2));
    }
}