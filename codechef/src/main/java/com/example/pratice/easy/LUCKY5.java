package com.example.pratice.easy;
import java.util.Scanner;
public class LUCKY5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            System.out.println(solve(s));;
        }
    }

    private static int solve(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '4' && s.charAt(i) != '7') {
                c++;
            }
        }
        return c;
    }
}
