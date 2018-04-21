package com.example.pratice.medium;

import java.util.Scanner;

public class MIXTURES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            long[][] dp = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = -1l;
                }
            }

            // solve
//            System.out.println(solve(a, n));
            System.out.println(solve2(0, n-1, dp, a));
        }
    }

    /**
     * this method go deep through recursion tree and find sum of small smokes
     * @param a array of mix
     * @param n current length of mix array
     * @return sum of small smokes
     */
    private static long solve(long[] a, int n) {
        if (n < 2) {
            return 0;
        }
        long min = Integer.MAX_VALUE;
        int index = 0, index1 = 0;
        for (int i = 0; i < n-1; i++) {

            // find next index. because of value of array are updated in each function call
            int next = i + 1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] != -1) {
                    next = j;
                    break;
                }
            }

            long t = (a[i] + a[next]) % 100;
            if (t < min) {
                min = t;
                index = i;
                index1 = next;
            }
        }

        long t1 = (a[index] * a[index1]);

        // cập nhật 2 biến tại index và index + 1
        // thành tổng của hai số chia lấy dư cho 100
        long t2 = (a[index] + a[index1]) % 100;
        a[index] = t2;
        a[index1] = -1;

        // gọi đệ quy với mảng đã cập nhất cộng với tích của 2 số tại index và index + 1
        return t1 + solve(a, n - 1);
    }

    private static long solve2(int i, int j, long[][] dp, long[] arr) {
        if (i >= j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        dp[i][j] = Integer.MAX_VALUE;
        for (int x = 0; x <= j; x++) {
            dp[i][j] = Math.min(dp[i][j],
                    solve2(i, x, dp, arr)
                            + solve2(x + 1, j, dp, arr)
                            + sum(i, x, arr) * sum(x + 1, j, arr));
        }
        return dp[i][j];
    }

    private static long sum(int i, int j, long[] arr) {
        long sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
            sum = sum % 100;
        }
        return sum;
    }
}
