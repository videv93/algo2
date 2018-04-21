package com.example.pratice.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Solution for CLEANUP problem
 * @see
 *      <a href="https://www.codechef.com/problems/CLEANUP">https://www.codechef.com/problems/CLEANUP</a>
 */
public class CLEANUP {

    /**
     * Check if array contains key k
     *
     * @param arr
     *          Array
     * @param k
     *          Key
     * @return
     */
    static boolean contains(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) return true;
        }
        return false;
    }

    /**
     * Print array
     *
     * @param arr
     */
    static void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] finished = new int[m];
            for (int i = 0; i < m; i++) {
                finished[i] = scanner.nextInt();
            }

            Arrays.sort(finished);

            List<Integer> chef = new ArrayList<>();
            List<Integer> assistant = new ArrayList<>();
            boolean isChef = true;
            for (int i = 1; i <= n; i++) {
                if (!contains(finished, i)) {
                    if (isChef) {
                        chef.add(i);
                        isChef = false;
                    } else {
                        assistant.add(i);
                        isChef = true;
                    }
                }
            }
            printArray(chef.toArray(new Integer[chef.size()]));
            printArray(assistant.toArray(new Integer[assistant.size()]));
        }
    }
}
