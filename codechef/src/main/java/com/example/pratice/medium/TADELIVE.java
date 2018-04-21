package com.example.pratice.medium;

import java.util.Scanner;

public class TADELIVE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(solve(a,b,x,y));
    }

    /**
     * Find the maximum tips (order of element in array) Bob and Andy will take
     * to maximize the tips
     * @param a tips if andy will take ith order
     * @param b tips if bob will take ith order
     * @param x maximize order andy can take
     * @param y maximize order bob can take
     * @return maximum tips bob and andy will take
     */
    private static int solve(int[] a, int[] b, int x, int y) {
        // 1. for every tips in array from left to right
        // we pick up tips as greater to correct person.
        // and update x, y values decrement by 1
        // when update if x or y  is equal to zero
        // we break get tips and calculate final tips result
        int atips = 0, btips = 0, i = 0;
        for (i = 0; i < a.length && x > 0 && y > 0; i++) {
             if (a[i] > b[i]) {
                 x--;
                 atips += a[i];
             } else {
                 y--;
                 btips += b[i];
             }
        }
        for (int j = i; j < a.length; j++) {
            if (x > 0) {
                atips += Math.max(a[j], b[j]);
            }
            if (y > 0) {
                btips += Math.max(a[j], b[j]);
            }
        }
        return atips + btips;
    }
}
