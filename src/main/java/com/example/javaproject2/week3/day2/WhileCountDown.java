package com.example.javaproject2.week3.day2;

public class WhileCountDown {
    public static void main(String[] args) throws InterruptedException {

        int cnt = 5;
        while (cnt > 0) {
            System.out.println(cnt--);
        }
    }
}
