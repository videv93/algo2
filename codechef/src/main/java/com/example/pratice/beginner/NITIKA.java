package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for NITIKA problem
 * @see
 *      <a href="https://www.codechef.com/problems/NITIKA">https://www.codechef.com/problems/NITIKA</a>
 */
public class NITIKA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while (T-- > 0) {
            String[] names = scanner.nextLine().split(" ");
            if (names.length == 0) {
                System.out.println("");
                continue;
            }
            for (int i = 0; i < names.length; i++) {
                if (i == names.length - 1) {
                    names[i] = foo(names[i], true);
                } else {
                    names[i] = foo(names[i], false);
                }
            }
            System.out.println(String.join(" ", names));
        }
    }

    /**
     * Get a name and index, return a correct format
     *
     * @param name
     * @param isLast
     * @return
     */
    static String foo(String name, boolean isLast) {
        if (isLast) {
            return name.substring(0,1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
        } else {
            String postFix = name.length() > 1 ? "." : "";
            return name.substring(0,1).toUpperCase() + postFix;
        }
    }
}
