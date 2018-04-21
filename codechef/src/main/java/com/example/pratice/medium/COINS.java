package com.example.pratice.medium;

import java.util.Scanner;

public class COINS {

    static int[] dp = new int[1000000];
    static final int MAX_SIZE = 1000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(solve2(n));
        }
    }

    private static long solve2(int n) {
        if (n < 12) {
            return n;
        }
        if (n < n/2 + n/3 + n/4) {
            return solve2(n/2) + solve2(n/3) + solve2(n/4);
        }
        return n;
    }

    private static long solve(int n) {
        long res;
        if (n < MAX_SIZE) {
            if (n < 12) {
                return n;
            }
            if (dp[n] > 0) {
                return dp[n];
            }
            res = solve(n/2) + solve(n/3) + solve(n/4);
            res = Math.max(res, n);
            dp[n] = (int) res;
        } else {
            res = solve(n/2) + solve(n/3) + solve(n/4);
            res = Math.max(res, n);
        }
        return res;
    }
}
