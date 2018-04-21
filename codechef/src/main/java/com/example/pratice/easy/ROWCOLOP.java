package com.example.pratice.easy;
import java.util.Scanner;
public class ROWCOLOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[][] = new int[n][n];
        int q = scanner.nextInt();
        while (q-- > 0) {
            String line = scanner.nextLine();
            String opt = "";
            int idx = 0, x = 0;
            try {
                opt = line.split("\\s")[0];
                idx = Integer.parseInt(line.split("\\s")[1]);
                x = Integer.parseInt(line.split("\\s")[2]);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

            }
            if (opt.equals("RowAdd")) {
                for (int i = 0; i < n; i++) {
                    a[idx-1][i] += x;
                }
            } else if (opt.equals("ColAdd")) {
                for (int i = 0; i < n; i++) {
                    a[i][idx-1] += x;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > ans) {
                    ans = a[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}
