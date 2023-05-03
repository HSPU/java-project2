package com.example.javaproject2.week3.day1;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "월";
        String time = "휴진";
        switch(day) {
            case "월", "화", "목", "금" -> time = "09:30-18:30";
            case "토" -> time = "09:30-13:00";
            case "수", "일" -> time = "휴진";
            default -> System.out.println("해당하는 요일이 없습니다.");
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
