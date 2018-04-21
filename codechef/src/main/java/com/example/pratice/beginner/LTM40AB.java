package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for LTM40AB problem
 * @see
 *      <a href="https://www.codechef.com/problems/LTM40AB">https://www.codechef.com/problems/LTM40AB</a>
 */
public class LTM40AB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int x = b - a + 1 + d-c + 1;
            if (b == c) {
                System.out.println(x - 1);
            } else {
                System.out.println(x);
            }
        }
    }
}
