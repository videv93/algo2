package videv.spoj.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMPDIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            List<String> ans = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (i % x == 0 && i % y != 0) {
                    ans.add(String.valueOf(i));
                }
            }
            System.out.println(String.join(" ", ans.toArray(new String[] {})));
        }
    }
}
