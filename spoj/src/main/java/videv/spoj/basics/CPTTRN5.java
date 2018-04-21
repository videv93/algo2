package videv.spoj.basics;

import java.util.Scanner;

public class CPTTRN5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int c = scanner.nextInt();
            int h = scanner.nextInt();

            int H = h + 1;
            int W = h + 1;
            int L = l * H + 1;
            int C = c * W + 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < C; j++) {
                    if (i % H == 0 || j % W == 0) {
                        sb.append("*");
                    } else {
                        int hh = i % H;
                        int ww = j % W;
                        if ((i / H) % 2 == 0) {
                            if ((j / W) % 2 == 0) {
                                if (hh == ww) {
                                    sb.append("\\");
                                } else {
                                    sb.append(".");
                                }
                            } else {
                                if (hh == W - ww) {
                                    sb.append("/");
                                } else {
                                    sb.append(".");
                                }
                            }
                        } else {
                            if ((j / W) % 2 == 0) {
                                if (hh == W - ww) {
                                    sb.append("/");
                                } else {
                                    sb.append(".");
                                }
                            } else {
                                if (hh == ww) {
                                    sb.append("\\");
                                } else {
                                    sb.append(".");
                                }
                            }
                        }
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
