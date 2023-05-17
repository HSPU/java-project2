package com.example.javaproject2.week5.day3;

public class Stack1 {
    int[] arr = new int[10000];
    int pointer = 0;

    public void push(int value) {
        arr[pointer++] = value;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return arr[--pointer];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        st.push(20);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
