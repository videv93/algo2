package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for A1 problem
 * @see <a href="https://www.codechef.com/problems/A1">https://www.codechef.com/problems/A1</a>
 */
public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(solve(a, a.length, m) ? "Yes" : "No");
        }
    }

    private static boolean solve(int[] a, int n, int sum) {
        if (sum == 0) {
            return true;
        }
        if (n == 0 && sum > 0) {
            return false;
        }
        if (a[n-1] > sum) return solve(a, n-1, sum);
        return solve(a, n-1, sum) || solve(a, n-1, sum - a[n-1]);
    }
}
