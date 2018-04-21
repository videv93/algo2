package videv.spoj.basics;

import java.util.Scanner;

public class SMPCIRC {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x01 = scanner.nextInt();
            int y01 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x02 = scanner.nextInt();
            int y02 = scanner.nextInt();
            int r2 = scanner.nextInt();
            double d = Math.sqrt(Math.pow(x01 - x02, 2) + Math.pow(y01 - y02, 2));
            if (r1 == d + r2 || r2 == d + r1) {
                System.out.println("E");
            } if (r1 > d + r2 || r2 > d + r1) {
                System.out.println("I");
            } else {
                System.out.println("O");
            }
        }
    }
}
