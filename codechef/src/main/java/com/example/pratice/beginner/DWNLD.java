package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for DWNLD problem
 * @see
 *      <a href="https://www.codechef.com/problems/DWNLD">https://www.codechef.com/problems/DWNLD</a>
 * @author
 *      vi.tt
 */
public class DWNLD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int total = 0, free = 0;
            for (int i = 0; i < n; i++) {
                int tc = scanner.nextInt();
                int td = scanner.nextInt();

                total += tc * td;
                // free
                if (tc <= k && k > 0) {
                    free += tc * td;
                    k = k - tc;
                } else if (tc > k && k > 0) {
                    free += k * td;
                    k = 0;
                }
            }
            System.out.println(total - free);
        }
    }
}
