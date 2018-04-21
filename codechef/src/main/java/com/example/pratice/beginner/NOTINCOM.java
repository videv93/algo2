package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for NOTINCOM problem
 * @see
 *      <a href="https://www.codechef.com/problems/NOTINCOM">https://www.codechef.com/problems/NOTINCOM</a>
 */
public class NOTINCOM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            int[] a = new int[A];
            int[] b = new int[B];

            for (int i = 0; i < A; i++) a[i] = scanner.nextInt();
            for (int i = 0; i < B; i++) b[i] = scanner.nextInt();

            int c = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        c++;
                        break;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
