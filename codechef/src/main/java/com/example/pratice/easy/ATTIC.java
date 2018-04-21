package com.example.pratice.easy;

import java.util.Scanner;

public class ATTIC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String p = scanner.nextLine();
            String[] ap = p.split("#+");
            if (ap.length == 0) {
                System.out.println(0);
                continue;
            }
            int curJump = 0, days = 0;
            for (int i = 0; i < ap.length; i++) {
                if (ap[i].length() > curJump) {
                    curJump = ap[i].length();
                    days++;
                }
            }
            System.out.println(days);
        }
    }
}
