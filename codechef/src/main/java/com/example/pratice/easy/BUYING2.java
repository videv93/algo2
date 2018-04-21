package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for BUYING2 problem
 * @see
 *      <a href="https://www.codechef.com/problems/BUYING2">https://www.codechef.com/problems/BUYING2</a>
 */
public class BUYING2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[][] bankNotes = getBankNotPossible(arr, x);
            boolean b = true;
            for (int i = 0; i < bankNotes.length; i++) {
                if (bankNotes[i].length < arr.length) {
                    b = false;
                }
            }
            if (b) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }

    private static int[][] getBankNotPossible(int[] arr, int x) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int m = sum / x;
        int[][] res = new int[100][100];
        for (int i = 0; i < 100; i++) {
            res[i] = new int[100];
        }


        return null;
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
}
