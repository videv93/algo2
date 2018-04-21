package com.example;

public class CountDig {

    /**
     * Count digits from Math.pow(n,2). Using complexity is 0(n2)
     * @param n
     * @param d
     * @return
     */
    public static int nbDig(int n, int d) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String[] str = String.valueOf((int)Math.pow(i,2)).split("");
            for (int j = 0; j < str.length; j++) {
                if (String.valueOf(d).equals(str[j])) count ++;
            }
        }
        return count;
    }
}
