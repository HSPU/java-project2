package com.example.javaproject2.week4.day2;

public class DiEx {  // DiEx 라는 클래스에서 ShapeDrawer 를 사용(의존 Depends)한다.
    private ShapeDrawer shapeDrawer;
    public DiEx(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void doSth() {
        shapeDrawer.printShape(5);

    }
}
