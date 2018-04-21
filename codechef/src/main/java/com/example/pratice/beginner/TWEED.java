package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for TWEED problem
 * @see
 *      <a href="https://www.codechef.com/problems/TWEED"><https://www.codechef.com/problems/TWEED/a>
 */
public class TWEED {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String first = scanner.next();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            if (n == 1 && arr[0] % 2 == 0 && first.equals("Dee")) {
                System.out.println("Dee");
            } else {
                System.out.println("Dum");
            }
        }
    }
}
