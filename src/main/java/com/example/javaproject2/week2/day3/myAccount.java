package com.example.javaproject2.week2.day3;

public class myAccount {
    public static void main(String[] args) {
        int myAccount = 1_000_000;          // 초기 계좌 1,000,000원

        myAccount = myAccount - 500_000;    // 500,000원 출금
        System.out.println(myAccount);      // 남은 계좌 잔액 = 500,000원

        myAccount = myAccount + 4_000_000;  // 남은 계좌 잔액 + 4,000,000원 입금
        System.out.println(myAccount);      // 남은 계좌 잔액 = 4,500,000원
    }
}
