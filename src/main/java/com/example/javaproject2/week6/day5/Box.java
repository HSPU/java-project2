package com.example.javaproject2.week6.day5;

public class Box<T>{
    private T item;

    public T getItem() {
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }
}
class Main3 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("한글");
    }
}
