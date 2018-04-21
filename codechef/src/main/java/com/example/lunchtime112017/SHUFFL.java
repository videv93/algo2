package com.example.lunchtime112017;

import java.util.Scanner;

public class SHUFFL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int m = scanner.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = i+1;
            }
        }
    }
}
