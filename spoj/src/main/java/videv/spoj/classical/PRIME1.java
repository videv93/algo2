package videv.spoj.classical;

import java.util.Scanner;

public class PRIME1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            if (m < 2) m = 2;

            for (int i = m; i < n + 1; i++) {
                boolean flag = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }
}
