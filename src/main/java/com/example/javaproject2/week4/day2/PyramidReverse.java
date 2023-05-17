package com.example.javaproject2.week4.day2;

public class PyramidReverse {
    public PyramidReverse(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    private String spaceChar = "0";
    public void printPyramid(int height) {
        for (int i = height; i >= 0; i--) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i), "*".repeat(2 * i + 1));
        }
    }
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(h - i), "*".repeat(2 * i + 1));
    }
    public static void main(String[] args) {
        PyramidReverse pyramid2 = new PyramidReverse(" ");
        PyramidReverse pyramidSpacezero = new PyramidReverse("0");
        pyramid2.printPyramid(4);
        pyramid2.printPyramid(5);
    }
}
