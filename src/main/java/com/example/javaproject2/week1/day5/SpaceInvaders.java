package com.example.javaproject2.week1.day5;

public class SpaceInvaders {
    public void moveLeft() {
        int location = 0;
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }
    public void moveRight() {
        int location = 0;
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft(); // 키보드 왼쪽 키 누르면 실행되는 메소드
        si.moveRight(); // 키보드 오른쪽 키 누르면 실행되는 메소드
    }
}
