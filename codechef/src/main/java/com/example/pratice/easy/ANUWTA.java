package com.example.pratice.easy;
import java.util.Scanner;
public class ANUWTA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            // 0123456789
            // 0, 1, 2, 3, ... n, n - 1, n -2, n -3, n -4, ...,1
            int n = scanner.nextInt();
            System.out.println( 1l * (n+1) * (n+2)/2 -1);
        }
    }

    private static int solve(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 2;
        }
        return n + n + 1 + solve(n-2);
    }
}
