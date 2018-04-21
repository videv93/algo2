package com.example.pratice.beginner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for LOSTMAX problem
 * @see
 * <a href="https://www.codechef.com/problems/LOSTMAX">https://www.codechef.com/problems/LOSTMAX</a>
 */
public class LOSTMAX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while (T-- > 0) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = arr.length - 1;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != n && arr[i] > max) max = arr[i];
            }
            System.out.println(max);
        }
    }
}
