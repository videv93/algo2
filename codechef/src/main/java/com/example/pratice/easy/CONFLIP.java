package com.example.pratice.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for CONFLIP problem
 * @see
 *      <a href="https://www.codechef.com/problems/CONFLIP">https://www.codechef.com/problems/CONFLIP</a>
 */
public class CONFLIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int g = scanner.nextInt();
            for (int i = 0 ; i < g; i++) {
                int I = scanner.nextInt();
                int n = scanner.nextInt();
                int q = scanner.nextInt();
                if (n % 2 == 0) {
                    System.out.println(n/2);
                } else {
                    if (I == q) {
                        System.out.println(n/2);
                    } else {
                        System.out.println(n/2 + 1);
                    }
                }
            }
        }
    }
}
