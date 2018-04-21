package com.example.pratice.peer;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class BPHC03 {
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
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < Math.pow(n, 2); i++) {
            a[i/n][i%n] = scanner.nextInt();
        }
        System.out.println(Arrays.deepToString(a));
    }

}
