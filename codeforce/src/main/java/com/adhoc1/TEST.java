package com.adhoc1;

import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 42) {
            System.out.println(t);
            t = scanner.nextInt();
        }
    }
}
