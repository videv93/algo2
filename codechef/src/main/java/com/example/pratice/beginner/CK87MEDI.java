package com.example.pratice.beginner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for CK87MEDI problem
 * @see
 *      <a href="https://www.codechef.com/problems/CK87MEDI">https://www.codechef.com/problems/CK87MEDI</a>
 * @author
 *      vi.tt
 */
public class CK87MEDI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);

            System.out.println(arr[(n+k)/2]);
        }
    }
}
