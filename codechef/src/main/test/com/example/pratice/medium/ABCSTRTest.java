package com.example.pratice.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ABCSTRTest {
    @Test
    public void testPrintSubStr() {
        String s = "ABCDEFHGIJ";
        ABCSTR.printSubStr(s, s.length());
    }

    @Test
    public void testSolve() {
        String s = "ABACABA";
        assertEquals(2, ABCSTR.solve(s, s.length()));
    }

}