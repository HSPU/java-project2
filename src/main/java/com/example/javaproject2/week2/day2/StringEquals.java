package com.example.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");
        // 메모리 주소끼리 비교 하기 때문에 같다고 나오는 것입니다.

        String str1 = "GOLD";
        String str2 = "G";

        System.out.println("GOLD-->" + str1.hashCode()); // @2193504 의 "G"
        System.out.println("G-->" + str2.hashCode());    // @71 의 "G"

        // st1번의 G와 str2번이 같은지?
        boolean isSame = str1.substring(0, 1) == str2;
        isSame = str1.substring(0, 1).equals(str2);     // equals를 이용
        System.out.println(isSame);                     // 주소가 다르기 때문에 false
    }
}
