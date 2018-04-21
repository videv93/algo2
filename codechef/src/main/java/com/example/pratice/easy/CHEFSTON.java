package com.example.pratice.easy;
import java.util.Scanner;
public class CHEFSTON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextLong();
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                if (k / a[i] * b[i] > ans) {
                    ans = k / a[i] * b[i];
                }
            }
            System.out.println(ans);
        }
    }
}
