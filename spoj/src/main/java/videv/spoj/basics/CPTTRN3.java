package videv.spoj.basics;

import java.util.Scanner;

public class CPTTRN3 {

    int test() {
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            int M = 3 * m + 1;
            int N = 3 * n + 1;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (i % 3 == 0 || j % 3 == 0) {
                        sb.append("*");
                    } else {
                        sb.append(".");
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
