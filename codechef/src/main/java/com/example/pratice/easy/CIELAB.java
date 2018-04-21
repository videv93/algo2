package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for CIELAB problem
 * @see
 *      <a href="https://www.codechef.com/problems/CIELAB">https://www.codechef.com/problems/CIELAB</a>
 */
public class CIELAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = Math.abs(a - b);
        if (c % 10 != 9) {
            System.out.println(c + 1);
        } else {
            System.out.println(c - 1);
        }
    }
}
