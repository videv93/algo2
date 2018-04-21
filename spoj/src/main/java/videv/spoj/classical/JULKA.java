package videv.spoj.classical;

import java.math.BigInteger;
import java.util.Scanner;

public class JULKA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 10;
        while (t-- > 0) {
            String suApplesStr = scanner.nextLine();
            String gtApplesStr = scanner.nextLine();
            BigInteger suApples = new BigInteger(suApplesStr);
            BigInteger gtApples = new BigInteger(gtApplesStr);

            BigInteger klApples = suApples.add(gtApples).divide(new BigInteger("2"));
            BigInteger naApples = suApples.subtract(klApples);

            System.out.println(klApples.toString());
            System.out.println(naApples.toString());
        }

    }
}
