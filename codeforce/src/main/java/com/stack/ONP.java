package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class ONP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            System.out.println(printPostFix(s));
        }
    }

    private static String printPostFix(String s) {
        Stack<Character> stack = new Stack<>();
        String postfix = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                postfix = postfix + c;
            } else if (c == '(') {
                continue;
            } else if (c == ')') {
                postfix = postfix + stack.pop().toString();
            } else {
                stack.push(c);
            }
        }
        return postfix;
    }
}
