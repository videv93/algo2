package com.adhoc1;

import java.util.Scanner;

public class PALIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            for (s = addOne(s); ; s = addOne(s)) {
                if (isPalindrome(s)) {
                    System.out.println(s);
                    break;
                }
            }
        }
    }

    private static String addOne(String s) {
        char[] c = s.toCharArray();
        int carry = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            if (i == c.length - 1) {
                c[i] = (char)('0' + (c[i] - '0') + 1);
            } else {
                c[i] = (char)('0' + (c[i] - '0') + carry);
            }

            if (c[i] > '9') {
                c[i] = '0';
                carry = 1;
            } else {
                carry = 0;
            }
            if (carry == 0) {
                break;
            }
        }
        return carry > 0 ? "1" + String.valueOf(c) : String.valueOf(c);
    }


    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        boolean ans = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                ans = false;
            }
            i++;
            j--;
        }
        return ans;
    }
}
