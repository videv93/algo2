package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for BUGCAL problem
 * @see
 *      <a href="https://www.codechef.com/problems/BUGCAL">https://www.codechef.com/problems/BUGCAL</a>
 */
public class BUGCAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            String sa = String.valueOf(a);
            String sb = String.valueOf(b);

            if (sa.length() < sb.length()) {
                sa = repeat("0", sb.length() - sa.length() - 1) + sa;
            } else if (sa.length() > sb.length()) {
                sb = repeat("0", sa.length() - sb.length()- 1) + sb;
            }

            String[] sta = sa.split("");
            String[] stb = sb.split("");

            for (int i = 0; i < sta.length && i < sta.length; i++) {
                sta[i] = add(sta[i], stb[i]);
            }

            System.out.println(String.join("", sta));
        }
    }

    static String add(String a, String b) {
        int ia = Integer.parseInt(a);
        int ib = Integer.parseInt(b);
        return String.valueOf((ia + ib) % 10);
    }

    static String repeat(String s, int times) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < times; i++) {
            builder.append(s);
        }
        return builder.toString();
    }
}
