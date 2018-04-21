package com.example.pratice.easy;

import java.util.Date;
import java.util.Scanner;

public class RRECIPE {
    public static void main(String[] args) {
        boolean calTime = true;
        if (calTime) {
            Date start = new Date();
            solve();
            Date end = new Date();
            long duration = end.getTime() - start.getTime();
            System.out.println("Time to solve: " + duration + " ms");
        } else {
            solve();
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            int l = 0, r = s.length() - 1, ans = 1;
//            boolean isPrime = true;
            while (l < r) {
                if (s.charAt(l) == '?' && s.charAt(r) == '?') {
                    ans *= 26;
                } else if ((s.charAt(l) == '?' && s.charAt(r) != '?')
                        || (s.charAt(l) != '?' && s.charAt(r) == '?')) {
                    ans *= 1;
                } else {
                    ans = 0;
//                    isPrime = false;
                    break;
                }
                l++; r--;
            }

            System.out.println(ans);
        }
    }

}
