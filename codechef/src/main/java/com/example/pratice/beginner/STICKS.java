package com.example.pratice.beginner;

import java.util.*;

/**
 * Solution for STICKS problem
 * @see
 *      <a href="https://www.codechef.com/problems/STICKS">https://www.codechef.com/problems/STICKS</a>
 * @author
 *      vi.tt
 */
public class STICKS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] rep = new int[10010];
        int[] arr = new int[10010];
        int k = 0, n = 0;
        while (T-- > 0) {
           for (int i = 0; i < 10000; i++) {
               rep[i] = 0;
           }
           k = 0;
           n = scanner.nextInt();
           for (int i = 0; i < n; i++) {
               int h = scanner.nextInt();
               rep[h]++;
               if (rep[h] == 2 || rep[h] == 4) {
                   arr[k++] = h;
               }
           }
           System.out.println(Arrays.toString(arr));
           if (k < 2) {
               System.out.println(-1);
           } else {
               System.out.println(arr[k-1] * arr[k - 2]);
           }
        }
    }
}
