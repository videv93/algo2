package com.example.pratice.beginner;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Solution for CHEFSTUD problem
 * @see
 *      <a href="https://www.codechef.com/problems/CHEFSTUD">https://www.codechef.com/problems/CHEFSTUD</a>
 * @author
 *      vi.tt
 */
public class CHEFSTUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.next();
        while (T-- > 0) {
            String s = scanner.nextLine();
            StringBuilder builder = new StringBuilder(s);
            for (int i = 0; i < builder.length(); i++) {
                if (builder.charAt(i) == '<') builder.setCharAt(i, '>');
                else if (builder.charAt(i) == '>') builder.setCharAt(i, '<');
            }
            Matcher matcher = Pattern.compile("><").matcher(builder.toString());
            int count = 0;
            while (matcher.find()) count++;
            System.out.println(count);
        }
    }
}
