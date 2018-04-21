package com.example.pratice.easy;
import java.util.Scanner;
/**
 * Solution for DECSTR problem
 * @see
 *      <a href="https://www.codechef.com/problems/DECSTR">https://www.codechef.com/problems/DECSTR</a>
 */
public class DECSTR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            System.out.println(solve(scanner.nextInt()));
        }
    }

    static String solve(int k) {
        String s1 = "zyxwvutsrqponmlkjihgfedcba";
        if (k > 0 && k < 26) {
            return s1.substring(s1.length() - k - 1, s1.length());
        }
        int x = k / 25;
        String tmp = "";
        for (int i = 0; i < x; i++) {
            tmp = s1 + tmp;
        }

        String tmp1 = "";
        if (k % 25 != 0) {
            tmp1 = solve(k % 25);
        }

        tmp = tmp1 + tmp;
        return tmp;
    }
}
