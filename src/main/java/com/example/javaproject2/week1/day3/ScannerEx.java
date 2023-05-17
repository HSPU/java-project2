package com.example.javaproject2.week1.day3;

import java.util.Scanner;

public class ScannerEx {
    public void plusTwoNumbers(int val1, int val2) {

    }

    public void readTwoNumbersAndPlus() {
        // 숫자 2개 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요. 입력하고 엔터 입력하고 엔터");
        System.out.print("첫번째 숫자:");
        System.out.println("첫번째 숫자는 " + sc.nextInt() + "입니다.");
        System.out.print("두번째 숫자:");
        System.out.println("두번째 숫자는 " + sc.nextInt() + "입니다.");
    }
}
