package com.example.pratice.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Solution for GCD2 problem
 * @see
 *      <a href="https://www.codechef.com/problems/GCD2">https://www.codechef.com/problems/GCD2</a>
 */
public class GCD2 {
    static BigInteger zero = new BigInteger("0");
    static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(zero)) {
            return a;
        } else {
            return gcd(b, a.mod(b));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while (T-- > 0) {
            String[] tmp = scanner.nextLine().split(" ");
            BigInteger a = new BigInteger(tmp[0]);
            BigInteger b = new BigInteger(tmp[1]);

            System.out.println(gcd(a,b).toString());
        }
    }
}
