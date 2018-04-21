package videv.spoj.classical;

import java.util.Scanner;

public class HIGHWAYS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int[][] graph = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] = -1;
                }
            }
            for (int i = 0; i < m; i++) {
                int ss = scanner.nextInt();
                int ee = scanner.nextInt();
                int tt = scanner.nextInt();

                graph[ss][ee] = tt;
                graph[ee][ss] = tt;
            }

            System.out.println(solve(graph, n, start, end));
        }
    }

    // TODO:
    private static String solve(int[][] graph, int n, int start, int end) {

        return null;
    }
}
