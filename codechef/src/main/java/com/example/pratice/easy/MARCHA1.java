package com.example.pratice.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for MARCHA1 problem
 * @see
 *      <a href="https://www.codechef.com/problems/MARCHA1">https://www.codechef.com/problems/MARCHA1</a>
 */
public class MARCHA1 {

    static void wrong() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            boolean a = false;
            for (int i = 0; i < n; i++) {
                boolean b = false;
                for (int j = i+1; j < n; j++) {
                    int c = 0;
                    for (int k = i; k <= j; k++) {
                        c += arr[k];
                    }
                    if (c == m) {
                        a = true;
                        b = true;
                        break;
                    }
                }
                if (b) break;
            }
            if (a) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    static int correct(int[] arr, int n, int m) {
        if (arr.length == 0) {
            return 0;
        }
        if (m == 0) {
            return 1;
        }
        if (m < 0) {
            return 0;
        }
        if (n <= 0 && m > 0) {
            return 0;
        }
        return correct(arr, n-1, m - arr[n-1]) + correct(arr, n-1, m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            if (correct(arr, n, m) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
