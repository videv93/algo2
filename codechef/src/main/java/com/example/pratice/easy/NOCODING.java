package com.example.pratice.easy;

import java.util.Scanner;

public class NOCODING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            char[] c = s.toCharArray();
//            Arrays.sort(c);
//            System.out.println(Arrays.toString(c));
            int ans = 2;
            for (int i = 0; i < c.length - 1; i++) {
                if (c[i] > c[i+1]) {
                    ans +=  26 - (c[i] - c[i+1]) + 1;
                } else {
                    ans += c[i+1] - c[i] + 1;
                }
            }
            System.out.println(ans < c.length * 11 ? "YES" : "NO");
        }
    }
}
