package com.example.pratice.beginner;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Solution for EGRANDR problem
 * @see
 *      <a href="https://www.codechef.com/problems/EGRANDR">https://www.codechef.com/problems/EGRANDR</a>
 * @author
 *      vi.tt
 */
public class EGRANDR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            // not 2
            // any 5
            // avg greater than 4
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            boolean a = IntStream.of(arr).allMatch(x -> x > 2);
            boolean b = IntStream.of(arr).anyMatch(x -> x == 5);
            boolean c = IntStream.of(arr).summaryStatistics().getAverage() >= 4.0d;

            if (a && b && c)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
