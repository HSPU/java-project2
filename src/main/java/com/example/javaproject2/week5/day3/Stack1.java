package com.example.javaproject2.week5.day3;

public class Stack1 {
    int[] arr = new int[10000];
    int pointer = 0;

    public void push(int value) {
        arr[pointer++] = value;
        System.out.println(pointer);
    }
}
