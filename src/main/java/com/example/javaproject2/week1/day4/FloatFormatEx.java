package com.example.javaproject2.week1.day4;

public class FloatFormatEx {
    public static void main(String[] args) {
        // System.out.printf("%d", 0.5); 에러발생
        System.out.printf("%f\n", 0.5);
        System.out.printf("%.1f\n", 1.44);
        System.out.printf("%.2f\n", 3.78987);
    }
}
