package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class RockPaperScissors {
    // win, tie, lose
    public String play(int user, int computer) { // 매개변수 2개, String 타입
        // 0바위 1가위 2보
        if (user == 0 && computer == 1) {
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockPaperScissors rpc = new RockPaperScissors();
        System.out.println(rpc.play(sc.nextInt(), sc.nextInt()));
    }
}
