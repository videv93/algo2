package com.example.pratice.easy;
import java.util.Scanner;
public class RRSTONE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        if (k == 0) {
            for (int i = 0; i < n; i++) {
                if (i == a.length - 1) {
                    System.out.println(a[i]);
                } else {
                    System.out.print(a[i] + " ");
                }
            }
            return;
        }
        if (k % 2 == 1) {
            k = 1;
        } else {
            k = 2;
        }
        while (k-- > 0) {
            int idx = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] > a[idx]) {
                    idx = i;
                }
            }
            for (int i = 0; i < n; i++) {
                if (i != idx) a[i] = a[idx] - a[i];
            }
            a[idx] = 0;
        }
        for (int i = 0; i < n; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + " ");
            }
        }
    }
}
