package com.example.javaproject2.week2.day3;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0; // 누적할 변수 선언
        // 나머지를 먼저 구하고 그 뒤에 몫을 구해야 한다.

        answer = answer + num % 10; // 나머지 구해 누적하기
        System.out.printf("num:%d, answer:%d\n", num, answer);

        num = num / 10;
        answer = answer + num % 10; // 나머지 구해 누적하기
        System.out.printf("num:%d, answer:%d\n", num, answer);

        num = num / 10;
        answer = answer + num % 10; // 나머지 구해 누적하기
        System.out.printf("num:%d, answer:%d\n", num, answer);

    }
}
