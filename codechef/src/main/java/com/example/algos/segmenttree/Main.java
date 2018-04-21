package com.example.algos.segmenttree;

public class Main {
    /**
     * Find the sum of elements from index l to r where 0 <= l <= r <= n-1
     * @param a an array of element
     * @param l the left index inclusive
     * @param r the right index inclusive
     * @return sum of elements from index l to r
     */
    static int sum(int[] a, int l, int r) {
        int ans = 0;
        for (int i = l; i <= r; i++) {
            ans += a[i];
        }
        return ans;
    }

    /**
     * Update index th element in array to x
     * @param a array of elements
     * @param x value to update
     * @param index position of array to update
     */
    static void update(int[] a, int x, int index) {
        if (index > a.length)throw new ArrayIndexOutOfBoundsException();
        a[index] = x;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
