package com.example.pratice.easy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ANUBTG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (i % 4 < 2) {
                    ans += a[i];
                }
            }
            System.out.println(ans);
        }
    }
}
