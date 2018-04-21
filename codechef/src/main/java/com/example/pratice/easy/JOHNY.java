package com.example.pratice.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for JOHNY problem
 * @see
 *      <a href="https://www.codechef.com/problems/JOHNY">https://www.codechef.com/problems/JOHNY</a>
 */
public class JOHNY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int k = scanner.nextInt();
            int K = arr[k-1];
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == K) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
