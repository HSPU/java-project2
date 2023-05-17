package com.example.javaproject2.week1.day4;

import com.example.javaproject2.week1.day2.ByeClass;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0; // 최초로 값을 지정 하는 것 초기화

        ByeClass.PrintHello printHello;
        printHello = new ByeClass.PrintHello(); // new를 이용해 인스턴스화 및 초기화

        System.out.println(iVal);
        printHello.print();
    }
}
