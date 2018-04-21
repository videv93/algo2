package com.example.pratice.beginner;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Solution for LCOLLIS problem
 * @see
 *      <a href="https://www.codechef.com/problems/LCOLLIS">https://www.codechef.com/problems/LCOLLIS</a>
 * @author
 *      vi.tt
 */
public class LCOLLIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
//            scanner.next();
            int[][] arr = new int[N][M];
            for (int i = 0; i < N; i++) {
                // TODO - Get split string in next line
                String[] str = scanner.nextLine().split("");
                arr[i] = Stream.of(str).mapToInt(Integer::parseInt).toArray();
            }
            System.out.println(Arrays.deepToString(arr));
        }
    }
}
