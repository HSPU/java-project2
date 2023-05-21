package com.example.javaproject2.codeup;

import java.io.BufferedWriter;
        import java.io.IOException;
        import java.io.OutputStreamWriter;
        import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                for (int k = 0; k < blue; k++) {
                    String str = "";
                    str += i + " " + j + " " + k + "\n";
                    cnt += 1;
                    bw.write(str);
                }
            }
        }
        bw.flush();
        System.out.println(cnt);
    }
}
