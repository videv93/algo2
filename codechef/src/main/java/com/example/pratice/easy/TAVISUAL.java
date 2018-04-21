package com.example.pratice.easy;

import java.util.Scanner;

public class TAVISUAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a0 = scanner.nextInt();
            int q = scanner.nextInt();

            while  (q-- > 0) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                // 0 B 0 0 0
                // - 01 4
                //  0 B 0 0
                // - 3 5
                // 0 0 0 0 B
                // - 1 5
                // B 0 0 0 0
                if (l <= a0 && a0 <= r) {
                    a0 = l + r - a0;
                }
            }

            System.out.println(a0);
        }
    }
}
