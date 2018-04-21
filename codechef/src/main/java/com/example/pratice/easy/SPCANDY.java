package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for SPCANDY problem
 * @see
 *      <a href="https://www.codechef.com/problems/SPCANDY">https://www.codechef.com/problems/SPCANDY</a>
 */
public class SPCANDY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if (n == 0 && k == 0) {
                System.out.println(0 + " " + 0);
            } else if (n > 0 && k == 0) {
                System.out.println(0 + " " + n);
            } else {
                System.out.println(n / k + " " + n % k);
            }
        }
    }
}
