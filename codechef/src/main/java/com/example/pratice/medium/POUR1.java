package com.example.pratice.medium;

import java.util.Scanner;

public class POUR1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(solve(a,b,c));
        }
    }

    private static int solve(int a, int b, int c) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if (a < c) {
            return -1;
        }
        if (c % gcd(a,b) != 0) {
            return -1;
        }
        return Math.min(helper(a,b,c), helper(b, a,c));
    }

    private static int helper(int a, int b, int c) {
        int step = 1;

        int aa = a;
        int bb = 0;

        while (aa != c && bb != c) {

            int t = Math.min(a, b - bb);

            aa -= t;
            bb += t;

            step++;
            if (aa == c || bb == c) {
                break;
            }

            if (aa == 0) {
                step++;
                aa = a;
            }

            if (bb == b) {
                bb = 0;
                step++;
            }

        }
        return step;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
