package com.example.pratice.easy;
import java.util.Scanner;
public class ANUDTC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    private static String solve(int n) {
        String q1 = 360 % n == 0 ? "y" : "n";
        String q2 = n <= 360 ? "y" : "n";
        String q3 = n * (n+1) / 2 <= 360 ? "y" : "n";
        return String.join(" ", new String[] {q1,q2,q3});
    }
}
