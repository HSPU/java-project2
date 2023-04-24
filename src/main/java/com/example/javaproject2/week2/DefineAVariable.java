package com.example.javaproject2.week2;

import java.util.Scanner;

public class DefineAVariable {
    public static void main(String[] args) {
        int sum = 10;
        String name = "신우석";
        String name2 = new String("김미미"); // 원래는 이렇게 생김
        Scanner sc = new Scanner(System.in); // () 안에 들어가는 것이 파라미터

        String sOne = "1";
        int iOne = 1;
        float fOne = 1.0f; // f 안붙이면 double로 인식함

        System.out.printf("String : %s, Number : %d, Float : %f", sOne, iOne, fOne);
    }
}
