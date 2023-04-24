package com.example.javaproject2.week2;

public class FloatDigit {
    public static void main(String[] args) {

        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;
        double d10 = 1.23e10; // e10으로 넘어가는 경우 double 써야함

        System.out.printf("f5:%f\n", f5);
        System.out.printf("f6:%f\n", f6);
        System.out.printf("f7:%f\n", f7);
        System.out.printf("f8:%f\n", f8);
        
        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10);
        System.out.println("d10 = " + d10);

        float f1 = 3.141592653589793f; // 뒤에 f를 붙이면 반올림한다
        System.out.println(f1); // 3.1415927
        System.out.println("1" + 1);
    }
}
