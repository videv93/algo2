package com.example.pratice.easy;
import java.util.Arrays;
import java.util.Scanner;
public class AMMEAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long m = scanner.nextLong();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            Arrays.sort(a);
//            System.out.println(Arrays.toString(a));
            int ans = 0;
            for (int i = a.length - 1; i >=0 ; i--) {
                m -= a[i];
                ans++;
                if (m <= 0) {
                    break;
                }
            }
            if (m > 0) {
                ans = -1;
            }
//            System.out.println(Long.MAX_VALUE > Math.pow(10, 18) ? "yes" : "no");
            System.out.println(ans);
        }
    }
}
