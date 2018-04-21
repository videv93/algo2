package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for DIVIDING problem
 * @type
 *      cakewalk
 * @see
 *      <a href="https://www.codechef.com/problems/DIVIDING">https://www.codechef.com/problems/DIVIDING</a>
 * @author
 *      vi.tt
 */
public class DIVIDING {
    /**
     * Idea: count the sum of all integer. check if sum greater or equal sum of 1 to n.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long c = 0, value = 0;
        for (long i = 0; i < n; i++) {
            value = scanner.nextLong();
            c += value;
        }
        if (n * (n+1) /2 == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
