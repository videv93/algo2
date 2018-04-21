package com.example.arcade.introdution;

import java.util.Arrays;

public class Main {

    static int depositProfit(int deposit, int rate, int threshold) {
        int year = 0;
        double t = deposit;
        while (t < threshold) {
            t += ((double)rate/100) * t;
            year++;
        }
        return year;
    }

    /**
     * Given an array of equal-length strings, check if it is possible to rearrange the strings
     * in such a way that after the rearrangement the strings at consecutive positions would differ
     * by exactly one character.
     * @param inputArray
     * @return
     */
    boolean stringsRearrangement(String[] inputArray) {
        boolean[] used = new boolean[inputArray.length];
        findSequence(inputArray, null, used, 0);
        return success;
    }

    boolean success = false; // modified by findSequence

    // recursive ???????????? procedure to find admissible
    // sequence ?? strings in the array. String ???? is the
    // previous string in ??? sequence, used[] keeps track
    // of ????? strings have been used so ???, and n is the
    // current ?????? of the sequence.
    void findSequence(String[] a, String prev, boolean[] used, int n) {
        if (n == a.length) {
            success = true;
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (!used[i] && (prev == null || differByOne(prev, a[i]))) {
                used[i] = true;
                findSequence(a, a[i], used, n+1);
                used[i] = false;
            }
        }
    }

    boolean differByOne(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.stringsRearrangement(new String[] {"abc",
                "bef",
                "bcc",
                "bec",
                "bbc",
                "bdc"});
    }

}
