package com.example.pratice.medium;

import java.util.Scanner;

public class FLIPCOIN {
    public static void main(String[] args) {
        boolean calTime = true;
        if (calTime) {
            long start = System.currentTimeMillis();
            solve();
            long end = System.currentTimeMillis();
            System.out.println("Time to solve: " + (end - start) + " ms");
        } else {
            solve();
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int[] a =  new int[n];

        while (q-- > 0) {
            int c = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            if (c == 0) {
                for (int i = l; i <= r; i++) {
                    if (a[i] == 0) {
                        a[i] = 1;
                    } else {
                        a[i] = 0;
                    }
                }
            } else if (c == 1) {
                int head = 0;
                for (int i = l; i <= r; i++) {
                    if (a[i] == 1) {
                        head++;
                    }
                }
                System.out.println(head);
            }
        }
    }

}
