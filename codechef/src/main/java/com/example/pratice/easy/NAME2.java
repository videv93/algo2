package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for NAME2 problem
 * @see
 *      <a href="https://www.codechef.com/problems/NAME2">https://www.codechef.com/problems/NAME2</a>
 */
public class NAME2 {
    static boolean isSubSequence(String s1, String s2, int m, int n) {
        if (m == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return isSubSequence(s1, s2, m-1, n-1);
        }
        return isSubSequence(s1, s2, m, n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String str = scanner.nextLine();
            String s1 = str.split("\\s")[0];
            String s2 = str.split("\\s")[1];
            System.out.println(isSubSequence(s1, s2, s1.length(), s2.length())
                    || isSubSequence(s2, s1, s2.length(), s1.length()) ? "YES" : "NO");
        }
    }
}