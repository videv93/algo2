package com.example.lunchtime112017;

import java.util.Scanner;

public class LRQUER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < q; i++) {
                int type = scanner.nextInt();
                int l = scanner.nextInt() - 1;
                int r = scanner.nextInt() - 1;

                if (type == 1) {
                    int max = Integer.MIN_VALUE;
                    for (int j = l; j <= r; j++) {
                        int c = (arr[j] - arr[l]) * (arr[r] - arr[j]);
                        if (c > max) max = c;
                    }
                    System.out.println(max);
                } else {
                    arr[l] = r+1;
                }
            }

        }
    }
}
