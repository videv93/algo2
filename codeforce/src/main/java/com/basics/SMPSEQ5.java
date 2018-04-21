package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMPSEQ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        foo(scanner);
        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] q = new int[m];
        for (int i = 0; i < m; i++) {
            q[i] = scanner.nextInt();
        }
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < Math.min(n, m); i++) {
            if (s[i] == q[i]) {
                lst.add(String.valueOf(i + 1));
            }
        }

        System.out.println(String.join(" ", lst));
    }
}
