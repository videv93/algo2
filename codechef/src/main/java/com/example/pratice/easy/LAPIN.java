package com.example.pratice.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for {@link LAPIN } problem
 * @see
 *      <a href="https://www.codechef.com/problems/LAPIN">https://www.codechef.com/problems/LAPIN</a>
 */
public class LAPIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            String s1, s2;
            if (s.length() % 2 == 0) {
                s1 = s.substring(0, s.length()/2);
                s2 = s.substring(s.length() / 2, s.length());
            } else {
                s1 = s.substring(0, s.length()/2);
                s2 = s.substring(s.length() / 2 + 1, s.length());
            }
            if (sortString(s1).equals(sortString(s2))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    /**
     * Sort string alphabet
     *
     * @param s
     *
     * @return {@code String}
     *
     */
    static String sortString(String s) {
        String[] as = s.split("");
        Arrays.sort(as);
        return String.join("", as);
    }
}

