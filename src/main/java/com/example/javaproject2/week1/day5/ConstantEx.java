package com.example.javaproject2.week1.day5;

import com.example.javaproject2.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 3;
    public static final int MIN_LEVEL = 3; // static 을 붙이면 전역에서 호출 가능
    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
     // iVal = 2; 한번 값을 지정하면 바꾸는 것 안됨
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();

    }
}
