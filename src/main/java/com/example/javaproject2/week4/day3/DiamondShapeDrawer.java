package com.example.javaproject2.week4.day3;

public class DiamondShapeDrawer extends ShapeDrawer2 {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
            if (i <= pivot) {
                return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    public static void main (String[] args){
        DiamondShapeDrawer dsd = new DiamondShapeDrawer();
        dsd.printShape(5);
    }
}
