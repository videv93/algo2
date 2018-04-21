package com.example.pratice.easy;

import java.util.Date;
import java.util.Scanner;

public class BINTREE {
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
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int ans = 0;
            while (i != j) {
                if (i > j) {
                    i /= 2;
                    ans++;
                }

                if (j > i) {
                    j /= 2;
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

}
