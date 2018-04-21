package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for LONGSEQ problem
 * @see
 *      <a href="https://www.codechef.com/problems/LONGSEQ">https://www.codechef.com/problems/LONGSEQ</a>
 */
public class LONGSEQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        while (T-- > 0) {
            String s = scanner.nextLine();
            char[] cs = s.toCharArray();
            int count1 = 0, count0 = 0;
            for (int i = 0; i < cs.length; i++) {
                if (cs[i] == '1') count1++;
                else if (cs[i] == '0') count0++;
            }
            if (count1 == 1 || count0 == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
