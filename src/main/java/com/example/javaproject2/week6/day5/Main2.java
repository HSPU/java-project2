package com.example.javaproject2.week6.day5;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Rectangle 클래스 작성
class Rectangle1 implements Shape{

    Rectangle1(double row, double col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public double calculateArea() {
        return row * col;
    }

    @Override
    public double calculatePerimeter() {
        return (row + col) * 2;
    }

    private double row, col;    // 필드 생성 시 , 사용
}

// Circle 클래스 작성
class Circles implements Shape{

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius * Math.PI * 2;
    }
    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle1(5, 10);
        Shape circle = new Circles(3.5);

        double area1 = rectangle.calculateArea();
        double perimeter1 = rectangle.calculatePerimeter();

        double area2 = circle.calculateArea();
        double perimeter2 = circle.calculatePerimeter();

        System.out.println("사각형의 넓이: " + area1);
        System.out.println("사각형의 둘레: " + perimeter1);
        System.out.println("원의 넓이: " + area2);
        System.out.println("원의 둘레: " + perimeter2);
    }
}