package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for CHEFGR problem
 * @see <a href="https://www.codechef.com/problems/CHEFGR">https://www.codechef.com/problems/CHEFGR</a>
 */
public class CHEFGR {
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
            int max = a[0];
            for (int i = 0; i < n; i++) {
                max = Math.max(max, a[i]);
            }
            int s = 0;
            for (int i = 0; i < n; i++) {
                s += max - a[i];
            }
            if (m == s || ((m > s) && (m - s) % n == 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
