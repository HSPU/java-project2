package com.example.javaproject2.week4.day3;

public class PyramidShapeDrawer extends ShapeDrawer2 {

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - (i + 1)), "*".repeat(2 * i + 1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new PyramidShapeDrawer();
        rightTriangle.printShape(5);
    }
}
