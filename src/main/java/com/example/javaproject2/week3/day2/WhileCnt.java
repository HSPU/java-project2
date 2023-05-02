package com.example.javaproject2.week3.day2;

import java.time.LocalDateTime;

public class WhileCnt {
    public static void main(String[] args) throws InterruptedException {
        // 초기화식, 증감식 없는 for 문
        // 조건식만 있음
        int cnt = 0;
        while (cnt < 11) {
            System.out.println(cnt);
            cnt++;
            // System.out.println(cnt++); 같은 출력
        }
        System.out.println("cnt = " + cnt);
    }
}
