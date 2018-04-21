package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for ACBALL problem
 * @see
 *      <a href="https://www.codechef.com/problems/ACBALL">https://www.codechef.com/problems/ACBALL</a>
 * @author
 *      vi.tt
 */
public class ACBALL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while (T-- > 0) {
            char[] X = scanner.nextLine().toCharArray();
            char[] Y = scanner.nextLine().toCharArray();
            char[] Z = new char[X.length];

            for (int i = 0; i < X.length; i++) {
                if (X[i] == Y[i]) {
                    Z[i] = X[i] == 'B' ? 'W' : 'B';
                } else {
                    Z[i] = 'B';
                }
            }
            System.out.println(String.valueOf(Z));
        }
    }
}
