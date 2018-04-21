package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for ICPC16B problem
 * @see
 *      <a href="https://www.codechef.com/problems/ICPC16B">https://www.codechef.com/problems/ICPC16B</a>
 * @author
 *      vi.tt
 */
public class ICPC16B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            boolean b = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int c = arr[i] * arr[j];
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == c) {
                            b = true;
                            break;
                        }
                    }
                }
            }
            if (b) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
