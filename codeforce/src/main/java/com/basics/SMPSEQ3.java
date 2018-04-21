package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMPSEQ3 {
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
        for (int i = 0; i < s.length; i++) {
            boolean find = false;
            for (int j = 0; j < q.length; j++) {
                if (s[i] == q[j]) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                lst.add(String.valueOf(s[i]));
            }
        }

        System.out.println(String.join(" ", lst));
    }

    private static void foo(Scanner scanner) {
        int n = scanner.nextInt();

        int[] aux = new int[201];
        for (int i = 0; i < n; i++) {
            aux[scanner.nextInt() + 100]++;
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            aux[scanner.nextInt() + 100]++;
        }
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] == 1) {
                System.out.print((i - 100) + " ");
            }
        }
    }
}
