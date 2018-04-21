package com.example.pratice.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TACHSTCK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long d = scanner.nextLong();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a, Collections.reverseOrder());
        int idx = 0, c = 0;
        while (idx < a.length - 1) {
            int idx2 = idx + 1;
            if (a[idx] - a[idx2] <= d) {
                c++;
                idx = idx2+1;
            } else {
                idx = idx2;
            }
        }
        System.out.println(c);
    }
}
