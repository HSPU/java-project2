package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int answer = 0;
        int answer2 = 0;
        int answer3 = 0;

        while (num > 0) {
            answer += num % 10;
            num /= 10;
        }
        while (answer > 0) {
            answer2 += answer % 10;
            answer /= 10;
        }
        while (answer2 > 0) {
            answer3 += answer2 % 10;
            answer2 /= 10;
        }
        System.out.println(answer3);
    }
}
