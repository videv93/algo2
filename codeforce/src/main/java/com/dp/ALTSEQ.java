package com.dp;

import java.util.Scanner;

public class ALTSEQ {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int a[] = new int[n];
//        getContinueAltSubsquence(n, a);
        System.out.println(getLargestAltSubsequence(a, n));
    }

    private static int getLargestAltSubsequence(int[] a, int n) {
        return 0;
    }

    private static void getContinueAltSubsquence(int n, int[] a) {
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int s = 1, smax = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] * a[i-1] < 0) {
                s++;
                if (s > smax) {
                    smax = s;
                }
            } else {
                s = 1;
            }
        }
        System.out.println(smax);
    }
}
