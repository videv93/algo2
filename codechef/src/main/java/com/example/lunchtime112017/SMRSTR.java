package com.example.lunchtime112017;

import java.util.Scanner;

public class SMRSTR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            double s = 1;
            for (int i = 0; i < n; i++) {
                s = s / scanner.nextInt();
            }
            for (int i = 0; i < q; i++) {
                System.out.print((int) Math.floor(scanner.nextInt() * s) + " ");
            }
            System.out.println();
        }
    }
}
