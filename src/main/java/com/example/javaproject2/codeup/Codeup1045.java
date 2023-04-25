package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;                       // 첫 줄 덧셈
        int imsum = num1 - num2;                     // 둘째 줄 뺄셈
        int multipl = num1 * num2;                   // 셋째 줄 곱셈
        int division = num1 / num2;                  // 넷째 줄 나눗셈
        int remainder = num1 % num2;                 // 다섯째 줄 나머지
        float divisionResult = (float) num1 / num2;  // 여섯째 줄 나눈값

        System.out.println(sum);
        System.out.println(imsum);
        System.out.println(multipl);
        System.out.println(division);
        System.out.println(remainder);
        System.out.printf("%.2f", divisionResult);
    }
}
