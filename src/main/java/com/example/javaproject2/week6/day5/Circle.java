package com.example.javaproject2.week6.day5;

public class Circle implements shape{
    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;
}
