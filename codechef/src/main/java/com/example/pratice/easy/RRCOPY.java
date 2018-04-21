package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for {@link RRCOPY } problem
 * @see
 *      <a href="https://www.codechef.com/problems/RRCOPY">https://www.codechef.com/problems/RRCOPY</a>
 */
public class RRCOPY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(solve(a));
        }
    }

    private static int solve(int[] a) {
        int[] cnt = new int[100001];
        for (int i = 0; i < a.length; i++) {
            cnt[a[i]]++;
        }
        int ans = 0;
        for (int i = 0 ; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                ans++;
            }
        }
        return ans;
    }
}
