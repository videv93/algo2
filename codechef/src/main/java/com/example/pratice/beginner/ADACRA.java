package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for ADACRA problem
 * @see
 *      <a href="https://www.codechef.com/problems/ADACRA">https://www.codechef.com/problems/ADACRA</a>
 */
public class ADACRA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            if (s.indexOf(0) == 'U') {
                System.out.println(s.split("D+").length/2);
            } else {
                System.out.println(s.split("U+").length/2);
            }

        }
    }
}
