package com.example.pratice.medium;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

public class SUBLCMTest {
    @Test
    public void testGcd() {
        assertEquals(1, SUBLCM.gcd(3,4));
        assertEquals(12, SUBLCM.lcm(new int[] {3,4,6}, 2));
    }

    @Test
    public void testSolve() {
        /*
         * Generate first random testcase :')
         */
        int T = 1;
        while (T-- > 0) {
            int n = ThreadLocalRandom.current().nextInt(2, (int) Math.pow(10, 5) + 1);
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ThreadLocalRandom.current().nextInt(1, (int) Math.pow(10, 6) + 1);
            }
            SUBLCM.solve(a, a.length);
        }
    }
}