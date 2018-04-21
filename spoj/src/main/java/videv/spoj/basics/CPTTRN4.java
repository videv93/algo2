package videv.spoj.basics;

import java.util.Scanner;

public class CPTTRN4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int c = scanner.nextInt();
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            int L = l * (h + 1) + 1;
            int C = c * (w + 1) + 1;
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < C; j++) {
                    if (i % (h + 1) == 0 || j % (w + 1) == 0) {
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
