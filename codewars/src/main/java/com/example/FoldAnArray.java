package com.example;

import java.util.ArrayList;
import java.util.List;

public class FoldAnArray {

    /**
     * Fold an array {1,2,3,4,5} with n runs
     *
     * @param array
     * @param runs
     * @return
     */
    public static int[] foldArray(int[] array, int runs) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        while (runs-- > 0) {
            int l = 0;
            int r = list.size()-1;
            int mid = (l + r) / 2;
            while (l < r) {
                list.set(l, list.get(l) + list.get(r));
                l++;
                r--;
            }
            list = list.subList(0, mid+1);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
        
    }
}
