package com.example.pratice.easy;

import java.util.Scanner;

public class SUBGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }
//            solve(a);
            solve2(a);
        }
    }

    private static void solve2(int[] a) {
        int a0 = a[0];
        for (int i = 1; i < a.length; i++) {
            a0 = gcd(a0, a[i]);
        }
        if (a0 == 1) {
            System.out.println(a.length);
        } else {
            System.out.println(-1);
        }
    }

    private static void solve(int[] a) {
        int max = -1, a0 = a[0];
        for (int i = 1; i < a.length; i++) {
            int curIndex = i;
            while (curIndex < a.length && gcd(a0, a[curIndex]) == 1) {
                curIndex++;
            }
            if (curIndex > i && curIndex - i + 1 > max) {
                max = curIndex - i + 1;
            }
        }
        System.out.println(max);
    }

    static int gcd(int a, int b) {
        if (b == 0 ) {
            return a;
        }
        return gcd(b, a % b);
    }
}
