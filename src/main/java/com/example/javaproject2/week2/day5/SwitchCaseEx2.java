package com.example.javaproject2.week2.day5;

public class SwitchCaseEx2 {
    public static void main(String[] args) {
        int dayOfWeek = 2; // break

        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            default:
                System.out.println("해당 숫자에 해당하는 요일이 없습니다.");
        }
    }
}
