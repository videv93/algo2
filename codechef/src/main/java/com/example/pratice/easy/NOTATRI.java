package com.example.pratice.easy;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class NOTATRI {
    public static void main(String[] args) {
        boolean calTime = false;
        if (calTime) {
            Date start = new Date();
            solve2();
            Date end = new Date();
            long duration = end.getTime() - start.getTime();
            System.out.println("Time to solve: " + duration + " ms");
        } else {
            solve2();
        }
    }

    private static void solve2() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while ((n = scanner.nextInt()) > 0) {
            int[] a = new int[n];
            int i, j, k, cnt = 0;
            for (i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            for (i = n-1; i >= 2; i--) {
                j = i - 1;
                k = 0;
                while (k < j) {
                    if (a[i] > a[j] + a[k]) {
                        cnt += j - k;
                        k++;
                    } else {
                        j--;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while ((n = scanner.nextInt()) > 0) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int ans = 0;
            for (int i = 0; i < n-2; i++) {
                for (int j = i+1; j < n-1; j++) {
                    for (int k = j+1; k < n; k++) {
                        if (a[i] + a[j] < a[k] || a[i] + a[k] < a[j] || a[j] + a[k] < a[j]) {
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }

}
