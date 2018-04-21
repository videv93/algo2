package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for LIKECS01 problem
 * @see
 *      <a href="https://www.codechef.com/problems/LIKECS01">https://www.codechef.com/problems/LIKECS01</a>
 */
public class LIKECS01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            char[] cs = s.toCharArray();
            boolean b = false;
            for (int i = 0; i < cs.length; i++) {
                for (int j = i+1; j < cs.length; j++) {
                    if (cs[i] == cs[j]) b = true;
                }
            }
            System.out.println(b ? "yes" : "no");
        }
    }
}
