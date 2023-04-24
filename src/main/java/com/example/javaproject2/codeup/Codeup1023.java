package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num[] = sc.next().split("\\."); // split 구간 쪼개기
        int first = Integer.parseInt(num[0]);
        int second = Integer.parseInt(num[1]);
        System.out.printf("%d\n%d",first,second);
    }
}
