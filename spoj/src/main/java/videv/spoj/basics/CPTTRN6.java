package videv.spoj.basics;

import java.util.Scanner;

public class CPTTRN6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int c = scanner.nextInt();
            int h = scanner.nextInt();
            int w = scanner.nextInt();

            int H = h + 1;
            int W = w + 1;
            int L = l * H + h;
            int C = c * W + w;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < C; j++) {
                    if (i % H == H - 1) {
                        if (j % W == W - 1) {
                            sb.append("+");
                        } else {
                            sb.append("-");
                        }
                    } else {
                        if (j % W == W - 1) {
                            sb.append("|");
                        } else {
                            sb.append(".");
                        }
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
