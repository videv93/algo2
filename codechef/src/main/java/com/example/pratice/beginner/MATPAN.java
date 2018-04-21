package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for MATPAN problem
 * @see
 *      <a href="https://www.codechef.com/problems/MATPAN">https://www.codechef.com/problems/MATPAN</a>
 */
public class MATPAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        while (t-- > 0) {
            int[] prices = new int[26];
            for (int i = 0; i < 26; i++) {
                prices[i] = scanner.nextInt();
            }
            scanner.nextLine();
            String s = scanner.nextLine();
            char[] cs = s.toCharArray();

            int c = 0;
            for (int i = 0; i < alphabet.length; i++) {
                boolean b = false;
                for (int j = 0; j < cs.length; j++) {
                    if (alphabet[i] == cs[j]) {
                        b = true;
                    }
                }
                if (b) continue;
                else {
                    c += prices[alphabet[i] - 'a'];
                }
            }
            System.out.println(c);
        }
    }
}
