package com.example.pratice.easy;

import java.util.Date;
import java.util.Scanner;

public class PRGIFT {
    public static void main(String[] args) {
        boolean calTime = false;
        if (calTime) {
            Date start = new Date();
            solve();
            Date end = new Date();
            long duration = end.getTime() - start.getTime();
            System.out.println("Time to solve: " + duration + " ms");
        } else {
            solve();
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            boolean ans = false;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int count = 0;
                    for (int kk = i; kk <= j; kk++) {
                        if (a[kk]%2 == 0) {
                            count++;
                        }
                    }
                    if (count == k) {
                        ans = true;
                    }
                }
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }

}
