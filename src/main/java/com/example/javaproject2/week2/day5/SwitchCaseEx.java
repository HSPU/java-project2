package com.example.javaproject2.week2.day5;

public class SwitchCaseEx {
    public static void main(String[] args) {
        int dayOfWeek = 2; // no break

        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
            case 2:
                System.out.println("화요일");
            default:
                System.out.println("해당 숫자에 해당하는 요일이 없습니다.");
        }
    }
}
