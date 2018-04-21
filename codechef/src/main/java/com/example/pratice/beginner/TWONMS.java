package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for TWONMS problem
 * @see
 *      <a href="https://www.codechef.com/problems/TWONMS">https://www.codechef.com/problems/TWONMS</a>
 * @author
 *      vi.tt
 */
public class TWONMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int N = scanner.nextInt();

            int i = 1;
            while (N-- > 0) {
                if (i % 2 != 0) {
                    A *= 2;
                } else {
                    B *= 2;
                }
                i++;
            }
            if (A == 0 || B == 0)
                System.out.println(0);
            else
                System.out.println(A > B ? A/B : B/A);
        }
    }
}
