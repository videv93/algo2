package com.example.FEB18;

import java.util.Scanner;

class CHEFCHR {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            int count = 0;
            for (int i = 0; i < s.length() - 3; i++) {
                if (check(s.substring(i, i + 4))) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("lovely " + count);
            } else {
                System.out.println("normal");
            }
        }
    }

    /**
     * Check if string contains chef string
     * @param substring input string
     * @return true if string contains chef
     */
    private static boolean check(String substring) {
        return substring.contains("c") && substring.contains("h") && substring.contains("e") && substring.contains("f");
    }
}
