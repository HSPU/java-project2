package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User wooseok = new User();
        wooseok.name = "신우석";
        wooseok.phoneNumber = "010-1234-5678";
        wooseok.age = 27;

        User jaesung = new User();
        jaesung.name = "재성 매니저";
        jaesung.phoneNumber = "010-0000-0000";
        jaesung.age = 24;

        System.out.printf("%s님은 성인입니까? %s\n", wooseok.name, wooseok.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}
