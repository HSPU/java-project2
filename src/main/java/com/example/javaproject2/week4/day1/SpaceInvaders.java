package com.example.javaproject2.week4.day1;

public class SpaceInvaders {
    // 메인 메소드가 없기 때문에 실행 불가
    int location;     // 멤버변수 선언

    public void moveLeft() {
        // 왼쪽 이동 메소드
        location = location - 1;
    }

    public void moveRight() {
        // 오른쪽 이동 메소드
        location = location + 1;
    }
}
