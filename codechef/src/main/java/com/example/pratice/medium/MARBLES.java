package com.example.pratice.medium;

import java.util.Date;
import java.util.Scanner;

public class MARBLES {
    public static void main(String[] args) {
        boolean calTime = true;
        if (calTime) {
            Date start = new Date();
            solve();
            Date end = new Date();
            long duration = end.getTime() - start.getTime();
            System.out.println("Time to solve: " + duration + " ms");
        } else {
            solve();
        }
    }

    private static long nCr(int n, int r) {
        long result = 1;
        if (r > n/2) {
            r = n-r;
        }
        for (int i = 0; i < r; i++) {
            result  *= (n-i);
            result /= (i+1);
        }
        return result;
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long ans;
            if (n == k) {
                ans = 1;
            } else {
                int N = k;
                int r = n-k;
                ans = nCr(N+r-1, r);
            }
            System.out.println(ans);
        }
    }

}
