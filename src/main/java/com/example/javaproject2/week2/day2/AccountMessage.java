package com.example.javaproject2.week2.day2;

public class AccountMessage {
    public static void main(String[] args) {
        String name = "신우석";
        int balance = 20_000_000;
        String message = name + "님의 통장 잔고는 " + balance + "원 입니다.";
        System.out.println(message);
    }
}
