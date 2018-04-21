package com.example.pratice.easy;
import java.util.Scanner;
public class TOTR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tm = scanner.nextLine();
        int t = Integer.parseInt(tm.split("\\s")[0]);
        String m = tm.split("\\s")[1];
        while (t-- > 0) {
            System.out.println(solve(scanner.nextLine(), m));
        }
    }

    private static String solve(String s, String m) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (m.indexOf(s.toLowerCase().charAt(i)) != -1) {
                if (Character.isUpperCase(s.charAt(i))) {
                    sb.append(Character.toUpperCase(m.charAt(s.charAt(i) - 'A')));
                } else if (Character.isLowerCase(s.charAt(i))) {
                    sb.append(Character.toLowerCase(m.charAt(s.charAt(i) - 'a')));
                }
            } else {
                if (s.charAt(i) == '_') {
                    sb.append(" ");
                } else {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
