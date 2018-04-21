package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for HORSES problem
 * @see
 *      <a href="https://www.codechef.com/problems/HORSES">https://www.codechef.com/problems/HORSES</a>
 */
public class HORSES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int a = 0, b = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int abs = Math.abs(arr[i] - arr[j]);
                    if (abs < min) {
                        min = abs;
                        a = i;
                        b = j;
                    }
                }
            }
//            System.out.println(String.format("%d %d", arr[a], arr[b]));
            System.out.println(min);
        }
    }
}
