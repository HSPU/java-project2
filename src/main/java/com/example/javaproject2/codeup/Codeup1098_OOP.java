package com.example.javaproject2.codeup;

import java.util.Arrays;

public class Codeup1098_OOP {
    private int[][] arr;

    public Codeup1098_OOP(boolean printSeparator) {
        this.printSeparator = printSeparator;
    }

    private boolean printSeparator;

    public Codeup1098_OOP(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    public Codeup1098_OOP(int[][] arr) {
        this.arr = new int[5][5];
    }

    public void setBeam(int l, int direction, int x, int y) {
        for (int i = 0; i < l; i++) {
            if (direction == 0) {    // 가로
                arr[x - 1][y + i - 1] = 1;
            } else {    // 세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        int rowCnt = 10;
        int colCnt = 10;
        Codeup1098_OOP c1098 = new Codeup1098_OOP(5,5);
        c1098.printArr();
        c1098.setBeam(2, 0, 1, 1);
        c1098.printArr();
        c1098.setBeam(3, 1, 2, 3);
        c1098.printArr();
        c1098.setBeam(4, 1, 2, 5);
        c1098.printArr();
        c1098.setBeam(10, 1, 1, 1);
        c1098.printArr();
    }
}
