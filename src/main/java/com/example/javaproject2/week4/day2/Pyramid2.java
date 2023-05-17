package com.example.javaproject2.week4.day2;

public class Pyramid2 {
    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private String spaceChar = "0";
    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }

    public String makeALine(int height, int i) {      // 한 줄로 리팩토링
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }
    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public static void main(String[] args) {
        Pyramid2 pyramid2 = new Pyramid2(" ");
        Pyramid2 pyramidSpacezero = new Pyramid2("0");
        pyramid2.printPyramid(4);
        pyramid2.printPyramid(5);
        pyramid2.printPyramidWithSpaceChar(4, " ");
    }
}
