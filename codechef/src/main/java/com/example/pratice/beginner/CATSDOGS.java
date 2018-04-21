package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for CATSDOGS problem
 * @see
 *      <a href="https://www.codechef.com/problems/CATSDOGS">https://www.codechef.com/problems/CATSDOGS</a>
 * @author
 *      vi.tt
 */
public class CATSDOGS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            long c = scanner.nextLong();
            long d = scanner.nextLong();
            long l = scanner.nextLong();

            long min = 0, max = 0;

            if (c > 2*d) {
                min = d * 4 + (c - 2*d) * 4;
                max = (c+d) * 4;
            } else if (c < 2*d) {
                min = d * 4;
                max = (c+d) * 4;
            }
            if (l % 4 == 0 && l >= min && l <= max) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
