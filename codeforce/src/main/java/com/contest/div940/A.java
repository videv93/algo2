//package com.contest.div940;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (d == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(0);
        } else {
            Arrays.sort(a, Collections.reverseOrder());
            int ans = 0;
            while (ans < a.length && a[ans] - a[n-1] > d) {
                ans++;
            }
            System.out.println(ans);
        }
    }
}
