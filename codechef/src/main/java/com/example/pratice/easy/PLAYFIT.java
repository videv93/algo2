package com.example.pratice.easy;

import java.util.Date;
import java.util.Scanner;

public class PLAYFIT {

    static final int mod = Integer.MAX_VALUE;

    public static void main(String[] args) {
        boolean calTime = true;
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
            int ans = -1, maxm = -1, minm = mod, x;
            for (int i = 0; i < n; i++) {
                int ai = scanner.nextInt();
                ans = Math.max(ans, ai - minm);
                minm = Math.min(minm, ai);
            }
            if (ans > 0) {
                System.out.println(ans);
            } else {
                System.out.println("UNFIT");
            }
        }
    }
}
