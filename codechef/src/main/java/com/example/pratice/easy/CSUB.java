package com.example.pratice.easy;
import java.util.Scanner;
public class CSUB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            scanner.nextLine();
            String s = scanner.nextLine();
            System.out.println(solve2(s));
        }
    }

    private static long solve(String s) {
        long c = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == '1' && s.charAt(j) == '1') {
                    c++;
                }
            }
        }
        return c;
    }

    private static long solve2(String s) {
        long n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                n++;
            }
        }
        return n * (n+1) / 2;
    }
}
