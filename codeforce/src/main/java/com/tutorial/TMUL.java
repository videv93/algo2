package com.tutorial;

import java.math.BigInteger;
import java.util.Scanner;

class TMUL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String line = scanner.nextLine();
            String s1 = line.split("\\s")[0];
            String s2 = line.split("\\s")[1];
            BigInteger b1 = new BigInteger(s1);
            BigInteger b2 = new BigInteger(s2);
            System.out.println(b1.multiply(b2));
        }
    }

}
