package com.example.pratice.medium;

import java.util.Scanner;

public class SEAVOTE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s = 0, c = 0;
            for (int i = 0; i < n; i++) {
                s += scanner.nextInt();
            }
            if (s >= 100 && s <= 100 + n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");;
            }
        }
    }
}
