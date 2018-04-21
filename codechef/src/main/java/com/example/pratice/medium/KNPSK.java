package com.example.pratice.medium;

import java.util.Scanner;

public class KNPSK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weight = new int[n];
        int[] cost = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
            total += weight[i];
            cost[i] = scanner.nextInt();
        }
        System.out.println(solve2(total, weight, cost, n));
    }

    private static int solve(int k, int[] weight, int[] cost, int n) {
        if (k == 0 || n == 0) {
            return 0;
        }
        if (weight[n-1] > k) {
            return solve(k, weight, cost, n-1);
        } else {
            return Math.max(cost[n-1] + solve(k-weight[n-1], weight, cost, n-1)
                    , solve(k, weight, cost, n-1));
        }
    }

    private static String solve2(int W, int[] weight, int[] cost, int n) {
        int i = 0, w = 0;
        int[][] K = new int[n+1][W+1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    K[i][w] = 0;
                } else if (weight[i-1] <= w) {
                    K[i][w] = Math.max(cost[i-1] + K[i-1][w-weight[i-1]], K[i-1][w]);
                } else {
                    K[i][w] = K[i-1][w];
                }
            }
        }

        System.out.println(arrToStr(K));

        StringBuilder sb = new StringBuilder();
        for (int j = 1; j <= W; j++) {
            sb.append(K[n][j]).append(" ");
        }
        return sb.toString();
    }

    private static String arrToStr(int[][] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < a[i].length; j++) {
                sb.append(a[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
