package com.example.pratice.easy;

import java.util.Scanner;

public class DRAGNXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(solve(n, a, b));
        }
    }

    private static int solve(int n, int a, int b) {
        int ans = 0;
        String sa = Integer.toBinaryString(a);
        String sb = Integer.toBinaryString(b);
        int noOfOne = 0;
        for (int i = 0; i < sa.length(); i++) {
            if (sa.charAt(i) == '1') {
                noOfOne++;
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                noOfOne++;
            }
        }
        if (noOfOne < n) {
            ans = (int) (Math.pow(2, n)) - (int) Math.pow(2, n - noOfOne);
        } else {
            ans = (int) (Math.pow(2, n)) - (int) Math.pow(2, noOfOne - n);
        }
        return ans;
    }
}

