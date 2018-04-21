package com.example.pratice.easy;
import java.util.Scanner;
public class CNOTE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[] p = new int[n];
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = scanner.nextInt();
                c[i] = scanner.nextInt();
            }
            int pageNeed = x - y;
            boolean ans = false;
            for (int i = 0; i < n; i++) {
                if (p[i] >= pageNeed && c[i] <= k) {
                    ans = true;
                    break;
                }
            }
            if (ans) {
                System.out.println("LuckyChef");
            } else {
                System.out.println("UnluckyChef");
            }
        }
    }
}
