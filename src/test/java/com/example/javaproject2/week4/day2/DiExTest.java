package com.example.javaproject2.week4.day2;

import static org.junit.jupiter.api.Assertions.*;

class DiExTest {
    public static void main(String[] args) {
        ParallelogramShapeDrawer psd = new ParallelogramShapeDrawer();
        DiEx diEx = new DiEx(psd);
        diEx.doSth();
    }
}