package com.example.pratice.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for MAXDIFF problem
 * @see
 *      <a href="https://www.codechef.com/problems/MAXDIFF">https://www.codechef.com/problems/MAXDIFF</a>
 */
public class MAXDIFF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            k = n - k > k ? k : n - k;
            int son = 0, father = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i < k) {
                    son += arr[i];
                } else {
                    father += arr[i];
                }
            }

            System.out.println(father - son);
        }
    }
}
