package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for SEGM01 problem
 * @see
 *      <a href="https://www.codechef.com/problems/SEGM01">https://www.codechef.com/problems/SEGM01</a>
 */
public class SEGM01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while (T-- > 0) {
            String s = scanner.nextLine();
            if (s.indexOf("1") == -1) {
                System.out.println("NO");
            } else {
                String ts = s.replaceAll("1+[^1]+1+", "");
                System.out.println(ts.length() < s.length() ? "NO" : "YES");
            }

        }
    }
}
