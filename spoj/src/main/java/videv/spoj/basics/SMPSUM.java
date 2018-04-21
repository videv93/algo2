package videv.spoj.basics;

import java.util.Scanner;

public class SMPSUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long ans = 0;
        for (int i = a; i <= b; i++) {
            ans += Math.pow(i, 2);
        }
        System.out.println(ans);
    }
}
