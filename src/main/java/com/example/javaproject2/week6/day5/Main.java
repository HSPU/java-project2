package com.example.javaproject2.week6.day5;

public class Main {
    public static void main(String[] args) {
        shape circle = new Circle(5);

        double area = circle.calculateArea();
        System.out.println(area);
    }
}
