package com.example.javaproject2.week4.day3;

public class DrawDiamondNoRepeat {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }
    public static void main(String[] args) {
        int h = 9;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if (i <= pivot) {
                // 피라미드 로직
                // 초항이 3 등차가 -2
                // System.out.printf("pivot:%d %d 0:%d *:%d\n",pivot, i, pivot - i, 2 * i + 1);
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                // 역피라미드 로직
                // System.out.printf("pivot:%d %d 0:%d *:%d\n",pivot, i, i - pivot, 2 * (h - i) - 1);
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }
}
