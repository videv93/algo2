package videv.spoj.basics;

import java.util.Scanner;

public class BTCK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int[] a = new int[10];
            for (int i = 0; i < 10; i++) {
                a[i] = scanner.nextInt();
            }
            int k = scanner.nextInt();
            int[] b = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            boolean flag = solve(b, a, 0, a.length - 1, k);
            if (flag) {
                print(b, b.length);
            } else {
                System.out.println(-1);
            }

        }
    }

    static boolean solve(int[] a, int[] b, int l, int r, int k) {
        if (l == r) {
//            print(a, a.length);
            int s = 0;
            for (int i = 0; i < a.length; i++) {
                s += a[i] * b[i];
            }
            return s <= k;
        } else {
            for (int i = l; i <= r; i++) {
                swap(a, l, i);
                if (solve(a, b, l + 1, r, k)) {
                    return true;
                }
                swap(a, l, i);
            }
        }
        return false;
    }

    private static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void print(int[] a, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                sb.append(a[i]).append(" ");
            } else {
                sb.append(a[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
