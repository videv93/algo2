package com.example.pratice.easy;

import java.util.Scanner;

public class BROKPHON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            boolean[] b = new boolean[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n-1; i++) {
                if (a[i] != a[i+1]) {
                    b[i] = true;
                    b[i+1] = true;
                }
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (b[i]) ans++;
            }
            System.out.println(ans);
        }
    }
}
