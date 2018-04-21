package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for OJUMPS problem
 * @see
 *      <a href="https://www.codechef.com/problems/OJUMPS">https://www.codechef.com/problems/OJUMPS</a>
 */
public class OJUMPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        n = n % 6;
        if (n == 0) {
            System.out.println("yes");
        } else if (n - 1 == 0) {
            System.out.println("yes");
        } else if (n - 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
