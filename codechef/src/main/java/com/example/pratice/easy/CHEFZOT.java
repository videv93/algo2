package com.example.pratice.easy;

import java.util.Scanner;

public class CHEFZOT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int j = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            j = 0;
            while (i < n && a[i] != 0) {
                j++;
                i++;
            }
            if (j > ans) {
                ans = j;
            }
        }

        System.out.println(ans);
    }
}
