package com.classical;

import java.util.Scanner;

public class ACODE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!s.equals("0")) {
            s = scanner.nextLine();
            System.out.println(solve(s, 0));
        }
    }

    private static int solve(String s, int i) {
        if (i >= s.length() - 1) {
            System.out.println(String.format("------------end dp(%d,%d)-------------", i, s.length()-1));
            return 1;
        }
        if (i < s.length() - 2 && Integer.parseInt(s.substring(i, i+2)) <= 26) {
            System.out.println(String.format("------------call dp(%d,%d)-------------", i, s.length() -1));
            int s1 = solve(s, i+1);
            System.out.println(String.format("------------call dp(%d,%d)-------------", i, s.length()-1));
            int s2 = solve(s, i+2);
            return  s1 + s2;
        } else {
            System.out.println(String.format("------------call dp(%d,%d)-------------", i, s.length()-1));
            return solve(s, i+1);
        }
    }

}
