package com.example.pratice.medium;

import java.util.Date;
import java.util.Scanner;

public class TWTCLOSE {
    public static void main(String[] args) {
        boolean calTime = false;
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
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        int[] a = new int[n];
        int curOne = 0;

        while (m-- > 0) {
            String s = scanner.nextLine();
            String s0 = s.split("\\s")[0];
            if (s0.equals("CLICK")) {
                Integer index = Integer.parseInt(s.split("\\s")[1]) - 1;
                if (a[index] == 0) {
                    a[index] = 1;
                    curOne++;
                } else {
                    a[index]  = 0;
                    curOne--;
                }
            } else if (s0.equals("CLOSEALL")) {
                for (int i = 0; i < n; i++) {
                    a[i] = 0;
                }
                curOne = 0;
            }
            System.out.println(curOne);
        }
    }

}
