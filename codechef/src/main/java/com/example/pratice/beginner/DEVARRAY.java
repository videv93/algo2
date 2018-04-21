package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for DEVARRAY problem
 * @see
 *      <a href="https://www.codechef.com/problems/DEVARRAY">https://www.codechef.com/problems/DEVARRAY</a>
 * @author
 *      vi.tt
 */
public class DEVARRAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            if (n > max) max = n;
            if (n < min) min = n;
        }

        while (Q-- > 0) {
            int q = scanner.nextInt();
            if (q >= min && q <= max)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
