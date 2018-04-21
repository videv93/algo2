package com.example.pratice.medium;

import java.util.Scanner;

public class ABCSTR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(solve(s, s.length()));
    }

    /**
     * Count the number of substring of input string with size 3
     * and doesn't contain any symbols except 'A', 'B' or 'C'
     * @param s input string
     * @param n length of input string
     * @return
     */
    public static int solve(String s, int n) {
        int ans = 0;
        for (int i = 0; i < n - 3; i++) {
            String t = s.substring(i, i + 3);
            if (t.indexOf("A") != -1
                    && t.indexOf("B") != -1
                    && t.indexOf("C") != -1) {
                ans++;
            }
        }
        return ans;
    }

    /**
     * Print all substring of input string with size 3
     * @param s input string
     * @param n size of input string
     */
    public static void printSubStr(String s, int n) {
        for (int i = 0; i < n-3; i++) {
            System.out.println(s.substring(i, i + 3));
        }
    }
}
