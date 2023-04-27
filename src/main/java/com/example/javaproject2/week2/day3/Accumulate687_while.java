package com.example.javaproject2.week2.day3;

public class Accumulate687_while {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0; // 누적할 변수 선언

        while (num > 0) {
            answer = answer + num % 10; // 나머지 구해 누적하기
            num = num / 10;
            System.out.printf("num:%d, answer:%d\n", num, answer);
        }
    }
}
