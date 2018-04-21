package com.example.pratice.easy;

import java.util.Scanner;

/**
 *  Solution for LCPESY problem
 *  @see <a href="https://www.codechef.com/problems/LCPESY">https://www.codechef.com/problems/LCPESY</a>
 */
public class LCPESY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] a = new int[256];
        int[] b = new int[256];
        while (t-- > 0) {
            for (int i = 0; i < 256; i++) {
                a[i] = b[i] = 0;
            }
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            for (int i = 0; i < c1.length; i++) {
                a[c1[i]]++;
            }
            for (int i = 0; i < c2.length; i++) {
                b[c2[i]]++;
            }

            int ans = 0;
            for (int i = 0; i < 256; i++) {
                ans += Math.min(a[i], b[i]);
            }
            System.out.println(ans);
        }
    }
}
