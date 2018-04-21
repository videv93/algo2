package com.example.zco;

import java.util.Scanner;

/**
 * Solution for ZCO14003 problem
 *
 * TODO - Fix tle error when test for large input
 *
 * @see
 *      <a href="https://www.codechef.com/ZCOPRAC/problems/ZCO14003">https://www.codechef.com/ZCOPRAC/problems/ZCO14003</a>
 * @author
 *      vi.tt
 */
public class ZCO14003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        long[] carr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        for (int i = 0; i < arr.length; i++) {
            long c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= arr[i]) c += arr[i];
            }
            carr[i] = c;
        }
        int index = 0;
        for (int i = 1; i < carr.length; i++) {
            if (carr[i] > carr[index]) index = i;
        }

        System.out.println(carr[index]);
    }
}
