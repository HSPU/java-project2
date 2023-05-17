package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();      // List 선언과 초기화
        l1.add("Hello");                // List 에 값을 넣을 때
        l1.add(1);
        System.out.println(l1.get(0));  // List 에서 인덱스를 이용해 값을 뽑을 때
        System.out.println(l1.get(1));
        System.out.println(l1.size());  // 들어있는 값들의 개수
        System.out.println(l1.isEmpty());  // 들어있나?  false
//        l1.remove(0);                   // 인덱스 지우기
//        l1.remove(0);
        System.out.println(l1.isEmpty());  // 들어있나?  true

        for(var item : l1) {
            System.out.println(item);
        }
    }
}
