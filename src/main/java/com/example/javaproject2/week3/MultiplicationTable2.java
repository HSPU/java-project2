package com.example.javaproject2.week3;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        for (int i = 2; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
