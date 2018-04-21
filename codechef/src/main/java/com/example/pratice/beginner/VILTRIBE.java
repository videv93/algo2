package com.example.pratice.beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Solution of codechef problem
 * @see
 *      <a href="https://s3.amazonaws.com/codechef_shared/download/translated/NOV17/vietnamese/VILTRIBE.pdf">VILTRIBE</a>
 * @author
 *      vi.tt
 */
public class VILTRIBE {

    static void solve() throws IOException {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            String s = scanner.nextLine();
            char[] c = s.toCharArray();
            int a = 0, b = 0, ta = 0, tb = 0;
            char f = '\0';
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 'A') {
                    a++;
                    f = 'a';
                    if (ta > 0) {
                        a += ta;
                        ta = 0;
                    }
                } else if (c[i] == '.') {
                    if (f =='a') ta++;
                    else if (f == 'b') tb++;
                } else if (c[i] == 'B') {
                    b++;
                    f = 'b';
                    if (tb > 0) {
                        b += tb;
                        tb = 0;
                    }
                }
            }
            System.out.println(String.format("%s %s", a, b));
        }
    }

    public static void main(String[] args) {
        try {
            solve();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
