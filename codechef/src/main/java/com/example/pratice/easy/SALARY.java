package com.example.pratice.easy;

import java.util.Scanner;

public class SALARY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            System.out.println(solve(a, n));
        }
    }

    private static int solve(int[] a, int n) {
        int moves = 0;
        while (true) {
            boolean b = true;
            for (int j = 0; j < a.length && b; j++) {
                if (j + 1 < a.length && a[j] - a[j+1] != 0) {
                    b = false;
                }
            }
            if (b) {
                break;
            }

            int maxW = 0;
            for (int j = 0; j < n; j++) {
                maxW = Math.max(maxW, a[j]);
            }

            for (int j = 0; j < n; j++) {
                if (a[j] == maxW) {
                    a[j]--;
                    moves++;
                }
            }
        }
        return moves;
    }
}
