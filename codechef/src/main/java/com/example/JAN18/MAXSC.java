package com.example.JAN18;

import java.util.Arrays;
import java.util.Scanner;

public class MAXSC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int[] aa = new int[n*k];
            for (int i = 0; i < n * k; i++) {
                aa[i] = a[i % n];
            }
//            System.out.println(Arrays.toString(aa));
            long ans = 0;
            for (int i = 0; i < aa.length; i++) {
                for (int j = i; j < aa.length; j++) {
                    long s = 0l;
                    for (int l = i; l <= j; l++) {
                        s += aa[l];
                    }
                    if (s > ans) {
                        ans = s;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
