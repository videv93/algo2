package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for ALTARAY problem
 *
 * @see
 *      <a href="https://www.codechef.com/problems/ALTARAY">https://www.codechef.com/problems/ALTARAY</a>
 * @author
 *      vi.tt
 */
public class ALTARAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                int cnt = 1;
                for (int j = i; j < arr.length - 1; j++) {
                    if (arr[j] * arr[j + 1] < 0) cnt++;
                    else break;
                }
//                arr[i] = cnt;
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }
}
