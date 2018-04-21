package com.example.pratice.medium;

import java.util.Date;
import java.util.Scanner;

public class PRIME1 {
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

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            for (int i = n; i <= m; i++) {
                if(isPrime(i)) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
