package com.example.pratice.easy;

import java.util.Scanner;

public class LUCKYSTR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] s = new String[k];
        for (int i = 0; i < k; i++) {
            s[i] = scanner.nextLine();
        }

        while (n-- > 0) {
            String b = scanner.nextLine();
            boolean bb = false;
            for (int i = 0; i < s.length; i++) {
                if (b.indexOf(s[i]) != -1 || b.length() >= 47) {
                    bb = true;
                    break;
                }
            }
            if (bb) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }
}
