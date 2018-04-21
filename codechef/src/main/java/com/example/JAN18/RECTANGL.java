package com.example.JAN18;

import java.util.Arrays;
import java.util.Scanner;

public class RECTANGL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int[] aa = new int[] {a,b,c,d};
            Arrays.sort(aa);
            if (aa[0] == aa[1] && aa[2] == aa[3]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
