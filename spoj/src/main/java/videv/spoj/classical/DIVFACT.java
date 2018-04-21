package videv.spoj.classical;

import java.util.Scanner;

public class DIVFACT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();

            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }

            int ans = 0;
            for (int i = 1; i < f + 1; i++) {
                if (f % i == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
