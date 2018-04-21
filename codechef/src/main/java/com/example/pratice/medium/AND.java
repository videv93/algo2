package com.example.pratice.medium;

import java.util.Scanner;

public class AND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                sum += a[i] & a[j];
            }
        }
        System.out.println(sum);
    }
}
