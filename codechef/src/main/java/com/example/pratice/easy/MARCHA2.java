package com.example.pratice.easy;

import java.util.Date;
import java.util.Scanner;

public class MARCHA2 {
    public static void main(String[] args) {
        boolean calTime = false;
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
            int k = scanner.nextInt();
            boolean ans = true;

            int k0 = scanner.nextInt();
            if (k0 > 0) {
                System.out.println("No");
                continue;
            }

            for (int i = 1; i < k; i++) {
                long ki = scanner.nextLong();
                if (ki > Math.pow(2, i-1)) {
                    ans = false;
                    break;
                }
            }
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
