package com.example.pratice.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class CHEFA {
    public static void main(String[] args) {
        boolean calTime = false;
        if (calTime) {
            Date start = new Date();
            solve();
            Date end = new Date();
            long duration = end.getTime() - start.getTime();
            System.out.println("Time to solve: " + duration + " ms");
        } else {
            solve();
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            Arrays.sort(a, Collections.reverseOrder());
//            System.out.println(Arrays.toString(a));
            long ans = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    ans += a[i];
                }
            }
            System.out.println(ans);
        }
    }

}
