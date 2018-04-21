package com.example.challenge;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

    /**
     *
     * @param a
     * @return
     */
    static int[] digitalSumSort(int[] a) {
        Function<Integer, Integer> sumAllDigitOfInt = (x)->{
            return Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();
        };
        Function<Integer[], int[]> unboxed = (x)-> Arrays.stream(x).mapToInt(Integer::intValue).toArray();
        Function<int[], Integer[]> boxed = (x)->Arrays.stream(x).boxed().toArray(Integer[]::new);

        Integer[] A = boxed.apply(a);
        Arrays.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (sumAllDigitOfInt.apply(o1) < sumAllDigitOfInt.apply(o2)) {
                    return -1;
                } else if (sumAllDigitOfInt.apply(o1) > sumAllDigitOfInt.apply(o2)) {
                    return 1;
                } else {
                    return o1 - o2;
                }
            }
        });
        return unboxed.apply(A);
    }

    /**
     *
     * @param inputString
     * @return
     */
    static String[] isDivisibleBy6(String inputString) {
        BigInteger n, six = new BigInteger("6");
        List<String> lst = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            String s = inputString.replace("*", String.valueOf(i));
            n = new BigInteger(s);
            if (n.mod(six).toString().equals("0")) {
                lst.add(s);
            }
        }

        return lst.toArray(new String[lst.size()]);
    }

    /**
     *
     * @param word
     * @return
     */
    static int[] theJanitor(String word) {
        int[] res = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            res[c - 'a'] = -word.indexOf(String.valueOf(c)) + word.lastIndexOf(String.valueOf(c)) + 1;
        }
        return res;
    }

    /**
     *
     * @param messages
     * @return
     */
    int telephoneGame(String[] messages) {
        int inc = 0;
        while (inc < messages.length && messages[inc].equals(messages[inc + 1])) {
            inc++;
        };
        return inc < messages.length ? inc : -1;
    }

    /**
     * Given a list of strings g and an integer z, sort the strings by the zth 1-based character ignoring the characters' case.
     * In case of a tie, the first element that appears in g should go first.
     *
     * @param g
     *      {@code String[ư}
     * @param z
     *      {@code int}
     * @return
     *
     */
    String[] SortByZ(String[] g, int z) {
        return null;
    }

    /**
     * Given an array of string numbers (i.e. strings that contain only digits),
     * return the greatest possible number of appending these numbers to each other as a string.
     * @param nums
     * @return
     */
    static String hugeNumber(String[] nums) {
        Arrays.sort(nums, new Comparator<String>() {

            @Override public int compare(String o1, String o2) {
                return - Integer.parseInt(o1+o2) + Integer.parseInt(o2+o1);
            }
        });
        return String.join("", nums);
    }

    int longestSequence(int[] a) {
        int best = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int diff = a[j] - a[i];
                if (diff == 0) {
                    continue;
                }
                int cur = 1;
                int last = a[i];
                for (int k = j; k < a.length; k++) {
                    if (a[k] - last == diff) {
                        cur++;
                        last = a[k];
                    }
                }
                if (cur > best) {
                    best = cur;
                }
            }
        }

        return best;
    }

    /**
     * You are given a string, you need to check whether or not a palindrome can be obtained by
     * swapping at most two pairs of characters of the corresponding string.
     * @param s
     * @return
     */
    boolean almostPalindrome(String s) {
        char[] c = s.toCharArray();
        int mid = s.length() / 2;
        int l = 0, r = mid + 1;
        boolean ans = true;
        while (true) {
            if (isPalindrom(c)) {
                break;
            } else if (l == mid - 1 && r == c.length - 1) {
                ans = false;
                break;
            }

            char t = c[l];
            c[l] = c[r];
            c[r] = t;

            if (r == c.length - 1) {
                l++;
                r = mid + 1;
            } else {
                r++;
            }
        }
        return ans;
    }

    boolean isPalindrom(char[] s) {
        int l = 0, r = s.length - 1;
        while(l < r) {
            if (s[l] != s[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.almostPalindrome("aaabaaa");
        main.almostPalindrome("abcbcdf");
    }

}
