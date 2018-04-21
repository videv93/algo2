package com.example.pratice.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Solution for PCYCLE problem
 * @see
 *      <a href="https://www.codechef.com/problems/PCYCLE">https://www.codechef.com/problems/PCYCLE</a>
 */
public class PCYCLE {

    /**
     * Find the first element of array is true
     *
     * @param b
     *         {@code boolean[]}
     * @return
     *          {@code int}
     */
    static int findStart(boolean[] b) {
        int s = -1;
        for (int i = 0; i < b.length; i++) {
            if (!b[i]) {
                 s = i;
                 break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
            b[i] = false;
        }

        int start = 0, current = 0;

        List<List<Integer>> lst = new ArrayList<>();

        while ((start = findStart(b)) != -1) {

            current = a[start] - 1;

            List<Integer> mvLst = new ArrayList<>();
            mvLst.add(start + 1);
            b[start] = true;

            while (a[current] != a[start]) {
                mvLst.add(current + 1);
                b[current] = true;
                current = a[current] - 1;
            }
            mvLst.add(current + 1);
            lst.add(mvLst);
        }

        System.out.println(lst.size());
        for (List<Integer> l1 : lst) {
            for (Integer l2 : l1) {
                System.out.print(l2 + " ");
            }
            System.out.println();
        }
    }
}
