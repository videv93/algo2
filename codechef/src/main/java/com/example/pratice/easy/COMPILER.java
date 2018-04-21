package com.example.pratice.easy;

import java.util.Scanner;

public class COMPILER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            System.out.println(solve(s));
        }
    }

    private static int solve(String s) {
        int t = 0, ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '<') {
                t++;
            } else {
                t--;
            }
            if (t == 0) {
                ans = Math.max(ans, i + 1);
            } else if (t < 0) {
                break;
            }
        }
        return ans;
    }
}
