package com.example.pratice.easy;
import java.util.Scanner;
public class PLZLYKME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int d = scanner.nextInt();
            int s = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(solve(l,d,s,c));
        }
    }

    private static String solve(int l, int d, int s, int c) {
        return s * Math.pow(1+c, d-1) >= l ? "ALIVE AND KICKING" : "DEAD AND ROTTING";
    }
}
