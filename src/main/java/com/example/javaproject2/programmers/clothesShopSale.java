package com.example.javaproject2.programmers;

public class clothesShopSale {
    public static void main(String[] args) {
        int price = 580000;
        int result = 0;

        if (price >= 500000) result = (int) (price * 0.8);
        else if (price >= 300000) result = (int) (price * 0.9);
        else if (price >= 100000) result = (int) (price * 0.95);
        System.out.println(result);
    }
}
