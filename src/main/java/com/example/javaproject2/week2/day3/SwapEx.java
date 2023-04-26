package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        // 오름차순으로 정렬하는 알고리즘을 만들어 보세요
        int[] arr = {2, 1, 4, 8, 7, 6};

        int temp = arr[0];  // temp 에 넣어 저장한다
        arr[0] = arr[1];    // 0번에 덮어 쓴다
        arr[1] = temp;      // 저장한 값을 1번에 넣는다

        System.out.println(Arrays.toString(arr));
    }
}
