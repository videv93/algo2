package videv.spoj.basics;

import java.util.Scanner;

public class CPTTRN8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int c = scanner.nextInt();
            int h = scanner.nextInt();
            int w = h;

            int H = 2 * h;
            int W = 2 * w;
            int L = l * H;
            int C = c * W;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < C; j++) {
                    int hh = i % H;
                    int ww = j % W;
                    if ((hh / h) % 2 == 0) {
                        if ((ww / w) % 2 == 0) {
                            if (hh % h == (w - 1) - ww % w) {
                                sb.append("/");
                            } else {
                                if ((ww % w) + (hh % h) < w) {
                                    sb.append(".");
                                } else {
                                    sb.append("*");
                                }
                            }
                        } else {
                            if (hh % h == ww % w) {
                                sb.append("\\");
                            } else {
                                if ((ww % w) - (hh % h) > 0) {
                                    sb.append(".");
                                } else {
                                    sb.append("*");
                                }
                            }
                        }
                    } else {
                        if ((ww / w) % 2 == 0) {
                            if (hh % h == ww % w) {
                                sb.append("\\");
                            } else {
                                if ((ww % w) - (hh % h) > 0) {
                                    sb.append("*");
                                } else {
                                    sb.append(".");
                                }
                            }
                        } else {
                            if (hh % h == (w - 1) - ww % w) {
                                sb.append("/");
                            } else {
                                if ((ww % w) + (hh % h) < w) {
                                    sb.append("*");
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
