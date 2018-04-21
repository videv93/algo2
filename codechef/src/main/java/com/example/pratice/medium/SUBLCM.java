package com.example.pratice.medium;

import java.util.Arrays;
import java.util.Scanner;

public class SUBLCM {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int t = scanner.nextInt();
         while (t-- > 0) {
             int n = scanner.nextInt();
             int[] a = new int[n];
             for (int i = 0; i < n; i++) {
                 a[i] = scanner.nextInt();
             }
             System.out.println(solve(a, a.length));
         }
     }

    /**
     * Find the size of the largest contiguous subarray such that
     * <a href="https://en.wikipedia.org/wiki/Least_common_multiple">LCM</a> of
     * all integers inthat subarray is equal to product of all integers in that subarray
     * @param a input array
     * @param n length of input array
     * @return
     */
    public static int solve(int[] a, int n) {
        System.out.println(String.format("Begin calculate in array %s with size %d ", Arrays.toString(a), a.length));
        int maxL = -1;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int a0 = a[i], s = 1;
                for (int k = i; k <= j; k++) {
                    a0 = lcm(a0, a[k]);
                    s *= a[k];
                }
                if (a0 == s) {
                    maxL = j - i + 1;
                }
            }
        }
        System.out.println(String.format("Begin calculate in array %s with result %d ", Arrays.toString(a), maxL));
        return maxL;
    }

    /**
     * Find the lowest common multiple of input array
     * @param a input array
     * @param n length of input array
     * @return
     */
    public static int lcm(int[] a, int n) {
        if (a.length < 2) {
            return a[0];
        }
        int ans = a[0];
        for (int i = 1; i < n; i++) {
            ans = lcm(ans, a[i]);
        }
        return ans;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }

    /**
     * Find the greatest common divisor of two numbers
     * @param a first number
     * @param b second number
     * @return The greatest common divisor
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
