package com.example.pratice.medium.solutions;

import java.io.*;
import java.util.StringTokenizer;

public class RRFRNDS {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Friends solver = new Friends();
        solver.solve(1, in, out);
        out.close();
    }
}

class Friends {

    final int DEG = 5;
    final int MD = (1 << DEG) - 1;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[][] suggestion = new int[n][(n >> DEG) + 1];
        int[][] a = new int[n][(n >> DEG) + 1];
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') {
                    a[i][j >> DEG] |= (1 << (j & MD));
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if ((a[i][j >> DEG] & (1 << (j & MD))) != 0) {
                    for (int u = 0; u <= (n >> DEG); u++) {
                        suggestion[i][u] |= a[j][u];
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && ((a[i][j >> DEG] & (1 << (j & MD))) == 0) && ((suggestion[i][j >> DEG] & (1 << (j & MD))) != 0)) {
                    ans++;
                }
            }
        }
        out.println(ans);

    }
}

class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public String nextLine() {
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens())
            tokenizer = new StringTokenizer(nextLine());
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
}


