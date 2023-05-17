package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 19 x 19 크기의 이차원 배열을 선언하고, 배열을 입력합니다.
        int[][] arr = new int[19][19];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // 2. 입력한 (x, y) 좌표가 (10,10) 일 때 우선 x 좌표를 고정 시키고 y 좌표에 해당하는 값을 for문을 통해 반복하여 값이 0 이면 1로, 1이면 0으로 바꿔줍니다.

        // 3. 그 다음 y 좌표를 고정 시키고 x 좌표에 해당하는 값을 마찬가지로 for문을 통해 반복하여 0 과 1을 바꿔줍니다.
        // ※ 이 때 위 두개의 for문 순서는 바뀌어도 상관없습니다.(x 좌표를 먼저 고정하나 y 좌표를 먼저 고정하나 결과값은 같음)

        // 4. 두번째로 입력받은 num 값으로 위 두개의 for 문을 묶어줍니다.
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < arr.length; j++) { // arr[9][0~18]
                if (arr[x - 1][j] == 0) {
                    arr[x - 1][j] = 1;
                } else {
                    arr[x - 1][j] = 0;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][y - 1] == 0) {
                    arr[j][y - 1] = 1;
                } else {
                    arr[j][y - 1] = 0;
                }
            }
        }
        // 5. 십자 뒤집기를 한 배열을 출력해줍니다.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
