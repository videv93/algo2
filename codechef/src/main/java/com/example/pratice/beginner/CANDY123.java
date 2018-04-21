package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for CANDY123 problem
 * @see
 *      <a href="https://www.codechef.com/problems/CANDY123">https://www.codechef.com/problems/CANDY123</a>
 * @author
 *      vi.tt
 */
public class CANDY123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int i = 1, limakCandies = 0, bobCandies = 0;
            while (true) {
                if (i % 2 != 0) {
                    if (limakCandies > A) {
                        System.out.println("Bob");
                        break;
                    }
                    limakCandies += i;
                } else {
                    if (bobCandies > B) {
                        System.out.println("Limak");
                        break;
                    }
                    bobCandies += i;
                }
                i++;
            }
        }
    }
}
