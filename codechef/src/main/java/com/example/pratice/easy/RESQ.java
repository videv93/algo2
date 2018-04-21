package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for RESQ problem
 * @see
 *      <a href="https://www.codechef.com/problems/RESQ">https://www.codechef.com/problems/RESQ</a>
 */
public class RESQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (Math.abs(n/i - i) < min) {
                        min = Math.abs(n/i - i);
                    }
                }
            }
            System.out.println(min);
        }
    }
}
