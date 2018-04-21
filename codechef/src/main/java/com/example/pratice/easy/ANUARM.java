package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for ANUARM problem
 * @see <a href="https://www.codechef.com/problems/ANUARM">https://www.codechef.com/problems/ANUARM</a>
 */
public class ANUARM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < m; i++) {
                int position = scanner.nextInt();
                a[position] = 0;
                for (int j = position + 1; j < n; j++) {
                    a[j] = a[j-1] + 1;
                    if (a[j] > b[j]) {
                        b[j] = a[j];
                    }
                }
                for (int j = position - 1; j >= 0 ; j--) {
                    a[j] = a[j+1] + 1;
                    if (a[j] > b[j]) {
                        b[j] = a[j];
                    }
                }
//                System.out.println(Arrays.toString(a));
//                System.out.println(Arrays.toString(b));
//                System.out.println("-------------------");
            }
            System.out.println(arrayString(b, b.length));
        }
    }

    private static String arrayString(int[] b, int length) {
        String ans = "";
        for (int i = 0; i < length; i++) {
            if (i < length - 1) ans += b[i] + " ";
            else ans += b[i];
        }
        return ans;
    }
}
