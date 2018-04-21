package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for LEBOMBS problem
 * @see
 *      <a href="https://www.codechef.com/problems/LEBOMBS">https://www.codechef.com/problems/LEBOMBS</a>
 */
public class LEBOMBS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                boolean des = false;
                if (s.charAt(i) == '1') {
                    des = true;
                }
                if (i > 0 && s.charAt(i-1) == '1') {
                    des = true;
                }
                if (i < n-1 && s.charAt(i+1) == '1') {
                    des = true;
                }
                if (!des) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
