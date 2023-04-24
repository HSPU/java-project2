package com.example.javaproject2.week2;

public class BooleanEx {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = true;

        // boolean 타입으로 변수를 선언할 때는 보통 앞에 is를 붙여서 이 변수가 불리언임을 나타낸다
        boolean isPaymentSuccess = true;
        boolean isBalanceSufficient = false;

        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);
        System.out.println("isPaymentSuccess = " + isPaymentSuccess);
        System.out.println("isBalanceSufficient = " + isBalanceSufficient);
        
        int age = 30;
        boolean isAdult = age >= 18;
        System.out.println("isAdult = " + isAdult);
        age = 13;
        boolean isChild = age < 14;
        System.out.println("isChild = " + isChild);
    }
}
