package com.example.pratice.easy;
import java.util.Scanner;
public class WALK {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
           System.out.println(solve(n));
        }
    }

    private static int solve(int n) {
        int wmax = 0;
        for (int i = 0; i < n; i++) {
            int w = scanner.nextInt();
            if (w + i > wmax) {
                wmax = w + i;
            }
        }
        return wmax;
    }
}
