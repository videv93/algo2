package com.example.pratice.easy;

import java.util.Scanner;

public class ALEXNUMB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] a = new long[(int)n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            System.out.println(n*(n-1)/2);
        }
    }
}
