package com.example.javaproject2.week1.day4;

public class ByteTypeExercise {
    public static void main(String[] args) {
        byte byte1 = 10;
        byte byte2 = -127;
        byte byte3 = -128;
//        byte byte4 = -129;    1byte는 8bit이므로 -128 ~ 127까지 256개의 숫자를 저장할 수 있다.
//        byte byte5 = 128;     담기지 않는 수치
        System.out.println(byte1);
        System.out.println(byte2);
        System.out.println(byte3);
    }
}
