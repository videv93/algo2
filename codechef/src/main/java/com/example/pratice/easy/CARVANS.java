package com.example.pratice.easy;

import java.util.Scanner;

/**
 * Solution for CARVANS problem
 * @see
 *      <a href="https://www.codechef.com/problems/CARVANS">https://www.codechef.com/problems/CARVANS</a>
 */
public class CARVANS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] maxSpeed = new int[n];
            for (int i = 0; i < n; i++) {
                maxSpeed[i] = scanner.nextInt();
            }
            int answer = better(maxSpeed);
            System.out.println(answer);
        }
    }

    private static int basic(int[] maxSpeed) {
        int answer = 0;
        for (int i = 0; i < maxSpeed.length; i++) {
            boolean isMaxSpeed = true;
            for (int j = 0; j < i; j++) {
                if (maxSpeed[j] < maxSpeed[j+1]) {
                    isMaxSpeed = false;
                }
            }
            if (isMaxSpeed) {
                answer++;
            }
        }
        return answer;
    }

    private static int better(int[] maxSpeed) {
        int[] speed = new int[maxSpeed.length];
        speed[0] = maxSpeed[0];
        for (int i = 1; i < maxSpeed.length; i++) {
            speed[i] = Math.min(speed[i-1], maxSpeed[i]);
        }
        int answer = 0;
        for (int i = 0; i < maxSpeed.length; i++) {
            if (maxSpeed[i] == speed[i]) answer++;
        }
        return answer;
    }
}
