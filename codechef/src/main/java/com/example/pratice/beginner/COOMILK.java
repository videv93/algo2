package com.example.pratice.beginner;

import java.util.Scanner;

/**
 * Solution for COOMILK problem
 * @see
 *      <a href="https://www.codechef.com/problems/COOMILK">https://www.codechef.com/problems/COOMILK</a>
 */
public class COOMILK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            scanner.nextLine();
            String[] arr = new String[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.next();
            }
            boolean b = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].equals("cookie")) {
                   if (i == arr.length -1 || !arr[i+1].equals("milk")) {
                        b = false;
                        break;
                    }
                }
            }
            if (arr.length > 1 && b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
