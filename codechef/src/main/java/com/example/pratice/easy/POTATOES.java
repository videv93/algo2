package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for POTATOES problem
 * @see
 *      <a href="https://www.codechef.com/problems/POTATOES">https://www.codechef.com/problems/POTATOES</a>
 */
public class POTATOES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int i = x + y + 1; i < Integer.MAX_VALUE; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i%j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println(i - x - y);
                    break;
                }
            }
        }
    }
}
