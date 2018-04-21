package videv.spoj.classical;

import java.util.Scanner;

public class PALIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            if (s.matches("9+")) {
                StringBuilder sb = new StringBuilder();
                sb.append("1");
                for (int i = 0; i < s.length() - 1; i++) {
                    sb.append("0");
                }
                sb.append("1");
                System.out.println(sb.toString());
            } else {
                char[] c = s.toCharArray();
                System.out.println(solve(c, c.length));
            }
        }
    }

    private static String solve(char[] c, int n) {
        int mid = n / 2;
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;
        boolean leftSmaller = false;
        while (i >= 0 && c[i] == c[j]) {
            i--;
            j++;
        }
        if (i < 0 || c[i] < c[j]) {
            leftSmaller = true;
        }

        while (i >= 0) {
            c[j++] = c[i--];
        }

        if (leftSmaller) {
            int carry = 1;
            if (n % 2 == 1) {
                c[mid] += 1;
                carry = (c[mid] - '0') / 10;
                c[mid] = (char)('0' + (c[mid] - '0') % 10);
            }

            i = mid - 1;
            j = (n % 2 == 0 ? mid : mid + 1);

            while (i >= 0) {
                c[i] = (char)('0' + (c[i] - '0') + carry);
                carry = (c[i] - '0') / 10;
                c[i] = (char)('0' + (c[i] - '0') % 10);
                c[j] = c[i];
                i--;
                j++;
            }
        }
        return String.valueOf(c);
    }
}
