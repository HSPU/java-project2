package com.example.javaproject2.week4.day3;

public class RightTriangleShapeDrawer extends ShapeDrawer2 {

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i + 1));
    }

    public static void main(String[] args) {
        RightTriangleShapeDrawer rts = new RightTriangleShapeDrawer();
        rts.printShape(5);
    }
}
