package com.example.javaproject2.programmers;

public class BetweenXStr {
    public static void main(String[] args) {
        int[] num = {};

        String myString = "oxooxoxxox";
        String[] str = myString.split("x", -1);         // limit 가 음수면 뒤의 값도 출력됨
        for (int i = 0; i < str.length; i++) {
            if (str[i] != "x") {
                System.out.print(str[i].length());
            }
        }
    }
}
