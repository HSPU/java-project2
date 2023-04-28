package com.example.javaproject2.week2.day5;

public class GetGrade2 {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 70) {                  // 결과 C : A가 나오지 않는다.
            System.out.println("C");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("F");
        }
    }
}
