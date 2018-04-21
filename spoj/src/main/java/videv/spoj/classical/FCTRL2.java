package videv.spoj.classical;

import java.math.BigInteger;
import java.util.Scanner;

public class FCTRL2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            BigInteger ans = new BigInteger("1");
            for (int i = 1; i < n + 1; i++) {
                ans = ans.multiply(new BigInteger(String.valueOf(i)));
            }
            System.out.println(ans.toString());
        }
    }
}
