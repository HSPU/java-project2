package com.example.javaproject2.week2.day3;

import com.example.javaproject2.week1.day2.ByeClass;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        // Student 타입
        Student student = new Student(); // new 를 써서 Student 객체를 인스턴스로

        Student[] students = new Student[30];

        Object obj = new Student();
        Object obj2 = new ByeClass.PrintHello();

        // primitive type 은 class 가 아님
    }
}
