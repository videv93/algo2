package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for PERFCONT problem
 * @see
 *      <a href="https://www.codechef.com/problems/PERFCONT">https://www.codechef.com/problems/PERFCONT</a>
 * @author
 *      vi.tt
 */
public class PERFCONT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int P = scanner.nextInt();

            int cakewalk = 0, hard = 0;
            for (int i = 0; i < N; i++) {
                int p = scanner.nextInt();

                if (p <= P/10) hard++;
                if (p >= P/2) cakewalk++;
            }
            if (cakewalk == 1 && hard ==2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
