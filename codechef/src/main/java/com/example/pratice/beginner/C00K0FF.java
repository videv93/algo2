package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for C00K0FF problem
 * @see
 *      <a href="https://www.codechef.com/problems/C00K0FF">https://www.codechef.com/problems/C00K0FF</a>
 */
public class C00K0FF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int cakewalk = 0, simple = 0, easy = 0,
                    easyMedium = 0, medium = 0, mediumHar = 0, har = 0;
            for (int i = 0; i < n; i++) {
                String s = scanner.nextLine();
                if (s.equals("cakewalk")) {
                    cakewalk++;
                } else if (s.equals("simple")) {
                    simple++;
                } else if (s.equals("easy")) {
                    easy++;
                } else if (s.equals("easy-medium")) {
                    easyMedium++;
                } else if (s.equals("medium")) {
                    medium++;
                } else if (s.equals("medium-hard")) {
                    mediumHar++;
                } else if (s.equals("hard")) {
                    har++;
                }
            }

            if (cakewalk == 1 && simple == 1 && easy == 1
                    && (easyMedium == 1 || medium == 1)
                    && (mediumHar == 1 || har == 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
