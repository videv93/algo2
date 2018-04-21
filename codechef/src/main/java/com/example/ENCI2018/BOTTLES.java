package com.example.ENCI2018;

import java.util.Scanner;

public class BOTTLES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int ans;
            if (m % n == 0) {
                ans = m / n;
            } else {
                ans = m / n + 1;
            }
            System.out.println(ans);
        }
    }
}
