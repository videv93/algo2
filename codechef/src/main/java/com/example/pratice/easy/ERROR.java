package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for ERROR problem
 * @type
 *      cakewalk
 * @see
 *      <a href="https://www.codechef.com/problems/ERROR">https://www.codechef.com/problems/ERROR</a>
 * @author
 *      vi.tt
 */
public class ERROR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            char[] c = scanner.nextLine().toCharArray();
            boolean b = false;
            for (int i = 0; i < c.length - 2; i++) {
                if (c[i] == '0' && c[i+1] == '1' && c[i+2] == '0') {
                    b = true;
                    break;
                } else if (c[i] == '1' && c[i+1] == '0' && c[i+2] == '1') {
                    b = true;
                    break;
                }
            }
            if (b) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }
}
