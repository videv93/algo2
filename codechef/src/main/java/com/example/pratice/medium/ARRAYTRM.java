package com.example.pratice.medium;
import java.util.Arrays;
import java.util.Scanner;
public class ARRAYTRM {
    public static void main(String[] args) {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            int count = 1, max = 0;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] == a[i+1]) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    count = 1;
                }
            }
            if (max == k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
