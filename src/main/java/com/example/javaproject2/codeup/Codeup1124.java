package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String.valueOf 이용
        String str = sc.next();
        String str2 = str.substring(1, str.indexOf("H"));
        String str3 = str.substring(Integer.parseInt(String.valueOf(str.indexOf("H") + 1)));
        System.out.println(Integer.parseInt(str2) * 12 + Integer.parseInt(str3));
    }
}