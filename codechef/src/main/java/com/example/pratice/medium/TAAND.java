package com.example.pratice.medium;

import java.util.Scanner;

public class TAAND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        long ans = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] & a[j]) > ans) {
                    ans = a[i] & a[j];
                }
            }
        }

        System.out.println(ans);
    }
}
