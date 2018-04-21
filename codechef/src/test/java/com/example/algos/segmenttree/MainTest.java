package com.example.algos.segmenttree;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testMain() throws Exception {
        int[] a = new int[] {0,1,2,3,4,5,6,7,8,9};
        assertEquals(0, Main.sum(a, 0,0));
        assertEquals(45, Main.sum(a, 0,9));
//        assertEquals(0, Main.sum(a, 0,0));
//        assertEquals(0, Main.sum(a, 0,0));

        Main.update(a, 9, 0);
        assertEquals(9, a[0]);
    }

    public void testSegmentTree() throws Exception {
        int arr[] = {1,3,5,7,9,11};

        SegmentTree tree = new SegmentTree(arr);

        assertEquals(15, tree.sum(1, 3));
        tree.update(arr, arr.length, 1, 10);
        assertEquals(22, tree.sum(1, 3));
    }
}