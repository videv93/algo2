package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for https://www.codechef.com/problems/RIGHTRI problem
 * @see
 *      <a href="https://www.codechef.com/problems/RIGHTRI">https://www.codechef.com/problems/RIGHTRI</a>
 */
public class RIGHTRI {
    static int distanceSquare(int x1, int y1, int x2, int y2) {
        return (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < n ; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();
            int a = distanceSquare(x1,y1,x2,y2);
            int b = distanceSquare(x1,y1,x3,y3);
            int c = distanceSquare(x2,y2,x3,y3);
            if (2 * Math.max(a,Math.max(b,c)) == a+b+c) {
                res++;
            }
        }
        System.out.println(res);
    }

}
