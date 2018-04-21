package com.example.pratice.medium;

import java.util.Arrays;
import java.util.Scanner;

public class TASHIFT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        char[] a = scanner.nextLine().toCharArray();
        String sb = scanner.nextLine();
        char[] b = sb.concat(sb).toCharArray();

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
