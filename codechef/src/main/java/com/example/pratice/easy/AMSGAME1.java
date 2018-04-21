package com.example.pratice.easy;

import java.util.Scanner;

public class AMSGAME1 {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a0 = scanner.nextInt();
            for (int i = 1; i < n; i++) {
                int a = scanner.nextInt();
                a0 = gcd(a0, a);
            }
            System.out.println(a0);
        }
    }
}
