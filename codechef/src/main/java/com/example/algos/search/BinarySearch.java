package com.example.algos.search;

public class BinarySearch {
    static boolean binSearch(int[] arr, int l, int r, int k) {
        int mid = (l + r) / 2;

        if (arr[mid] == k) return true;

        if (arr[mid] < k) return binSearch(arr, mid + 1, r, k);

        if (arr[mid] > k) binSearch(arr, l, mid - 1, k);

        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,4,5,6,7,8,9};
        System.out.println(binSearch(arr, 0, arr.length -1, 2));
    }

}
