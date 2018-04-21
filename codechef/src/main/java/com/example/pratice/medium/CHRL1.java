package com.example.pratice.medium;

import java.util.Scanner;

public class CHRL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] cost = new int[n];
            int[] weight = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = scanner.nextInt();
                weight[i] = scanner.nextInt();
            }
            System.out.println(solve(k, cost, weight, n));
        }
    }

    private static int solve(int k, int[] cost, int[] weight, int n) {
        if (k == 0 || n == 0) {
            return 0;
        }
        if (cost[n-1] > k) {
            return solve(k, cost, weight, n-1);
        } else {
            return Math.max(weight[n-1] + solve(k - cost[n-1], cost, weight, n-1),
                    solve(k, cost, weight, n-1));
        }
    }
}
