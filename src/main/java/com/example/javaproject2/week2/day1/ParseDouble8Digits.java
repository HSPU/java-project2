package com.example.javaproject2.week2.day1;

public class ParseDouble8Digits {
    public static void main(String[] args) {
        String val1 = "1.11111111";
        String val2 = "2.11111111";
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("result = " + result); // 답 : 3.22222223

        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println("result2 = " + result2); // 답 : 3.22222222
    }
}
