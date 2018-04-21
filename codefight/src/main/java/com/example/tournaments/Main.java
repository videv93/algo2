package com.example.tournaments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /**
     * For st = "abcdc", the output should be buildPalindrome(st) = "abcdcba"
     *
     * @param st
     *          {@code String}
     * @return
     *          {@code String}
     */
    String buildPalindrome(String st) {
        boolean canConvert;
        for (int i = st.length(); ; i++) {
            canConvert = true;
            for (int j = 0; j < i - j - 1; j++) {
                if (i - j - 1 < st.length() && st.charAt(j) == st.charAt(i - j - 1)) {
                    canConvert = false;
                    break;
                }
            }
            if (canConvert) {
                for (int j = st.length(); j < i; j++) {
                    st += st.charAt(i - j - 1);
                }
                return st;
            }
        }
    }

    /**
     * Give a array. Find all number missing from consecutive array of given array
     * @param sequence
     *          {@code int[]}
     * @return
     *          {@code int[]}
     */
    int[] makeArrayConsecutive(int[] sequence) {

        ArrayList<Integer> answer = new ArrayList<>();
        int current_position = 0;

        Arrays.sort(sequence);
        for (int i = sequence[1]; i < sequence[sequence.length - 1]; i++) {
            if (sequence[current_position] != i) {
                answer.add(i);
            }
            else {
                current_position++;
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }

    /**
     * Given integers l and r, find the number of trailing zeros in the decimal representation of
     * l! * (l + 1)! * ... * r! (the exclamation mark means factorial).
     * @param l
     * @param r
     * @return
     */
    int factorialsProductTrailingZeros(int l, int r) {
        class Helper {
            int foo(int n) {
                int s = 1;
                for (int i = 1; i <= n; i++) {
                    s *= i;
                }
                return s;
            }
        }

        Helper h = new Helper();
        int s = 1;
        for (int i = l; i <= r; i++) {
            s *= h.foo(i);
        }
        int c = 0;
        while (s % 10 == 0) {
            c++;
            s /= 10;
        }
        return c;
    }

    /**
     * Find all distinct prime factors of a given integer.
     * Ex: 100 -> [2, 5]
     * @param n
     * @return
     */
    int[] primeFactors2(int n) {
        return null;
    }

    /**
     * You are given a tree with vertices numbered from 0 to N - 1. The tree is input as an array parent where parent[i] is the parent of the ith node of the tree. The root of the tree is the vertex number 0 and it is its own parent.
     * You are to paint some of the tree vertices in such a way that the painted vertices along with the edges between them form a full binary tree. What is the maximum possible size of such tree?
     * Note that the edges' orientations after painting remain the same, so the highest painted vertex will be a new root.
     * For parent = [0, 0, 1, 4, 1], the output should be
     * largestFullBinaryTree(parent) = 3.
     * @param parent
     * @return
     */
    int largestFullBinaryTree(int[] parent) {

        class Graph {
            ArrayList<Integer>[] edges;
            int maxBinTree;

            Graph(int[] parent) {
                maxBinTree = 1;
                edges = new ArrayList[parent.length];
                for (int i = 0; i < edges.length; i++) {
                    edges[i] = new ArrayList();
                }
                for (int i = 1; i < parent.length; i++) {
                    edges[parent[i]].add(i);
                }
            }

            int dfs(int v) {
                int firstMax = -1;
                int secondMax = -1;
                for (int u : edges[v]) {
                    int curMax = dfs(v);
                    if (curMax > firstMax) {
                        secondMax = firstMax;
                        firstMax = curMax;
                    } else if (curMax > secondMax) {
                        secondMax = curMax;
                    }
                }
                if (secondMax == -1) {
                    return 1;
                }
                int result = 1 + firstMax + secondMax;
                if (result > maxBinTree) {
                    maxBinTree = result;
                }
                return result;
            }
        }

        Graph g = new Graph(parent);
        g.dfs(0);
        return g.maxBinTree;
    }

    int firstMultiple(int[] divisors, int start) {

        for (int answer = start; ; answer++) {
            boolean correct = true;
            for (int i = 0; i < divisors.length; i++) {
                if (answer % divisors[i] != 0) {
                    correct = false;
                    break;
                }
            }
            if (correct) {
                return start;
            }
        }
    }

    boolean findPath(int[][] matrix) {

        int positionX = -1,
                positionY = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    positionX = i;
                    positionX = j;
                }
            }
        }
        for (int i = 1; i < matrix.length * matrix[0].length; i++) {
            boolean found = false;
            int nextX = -1;
            int nextY = -1;
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (dx * dy == 0) {
                        if (positionX + dx >= 0 && positionX + dx < matrix.length
                                && positionY + dy >= 0 && positionY + dy < matrix[0].length) {
                            if (matrix[positionX + dx][positionY + dy] == i + 1) {
                                found = true;
                                nextX = positionX + dx;
                                nextY = positionY + dy;
                            }
                        }
                    }
                }
            }
            if (found) {
                positionX = nextX;
                positionY = nextY;
            }
            else {
                return false;
            }
        }
        return true;
    }
    String replaceFirstDigitRegExp(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                input = input.replaceFirst(String.valueOf(input.charAt(i)), "#");
                break;
            }
        }
        return input;
    }

    int mostFrequentDigitSum(int n) {
        int[] a = new int[1000];
        while (n > 0) {
            int s = 0, t = n;
            while (t > 0) {
                s += t % 10;
                t /= 10;
                a[s]++;
            }
            n -= s;
        }
        int idx = 0, cur = a[0];
        for (int i = 1; i < 1000; i++) {
            if (a[i] > cur) {
                cur = a[i];
                idx = i;
            }
        }
        return a[idx];
    }


    int bfsDistancesUnweightedGraph2(boolean[][] matrix, int vertex1, int vertex2) {
        return 0;
    }
    /**
     * You are given an array of integers inputArray.
     * Consider all its contiguous subarrays of length k and pick the one with the maximum sum.
     * If there are several contiguous subarrays with the maximum sum, pick the leftmost one.
     * Put the 0-based index of the first (leftmost) element of that subarray into result[k - 1].
     * Do this for all k from 1 up to the length of the inputArray.
     * Return result.
     *
     * @param inputArray
     *      {@code int[]}
     * @return
     *      {@code int[]}
     */
    int[] maxSumSegments(int[] inputArray) {

        int[] result = new int[inputArray.length];
        for (int i = 1; i <= inputArray.length; i++) {
            int sum = 0,
                    mxSum = 0,
                    index = -1;
            for (int j = 0; j < inputArray.length; j++) {
                sum += inputArray[j];
                if (j >= i) {
                    sum -= inputArray[j - i];
                }
                if (j >= i && (index == -1 || sum > mxSum)) {
                    mxSum = sum;
                    index = j - i + 1;
                }
            }
            result[i - 1] = index;
        }
        return result;
    }

    /**
     * You are given two strings s and t of the same length,
     * consisting of uppercase English letters. Your task is to find the minimum number
     * of "replacement operations" needed to get some anagram of the string t from the string s.
     * A replacement operation is performed by picking exactly one character from the string s and
     * replacing it by some other character.
     * @param s
     * @param t
     * @return
     */
    int createAnagram(String s, String t) {

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt1[s.charAt(i) - 'A']++;
            cnt2[t.charAt(i) - 'A']++;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(cnt1[i] - cnt2[i]);
        }

        return ans / 2;
    }

    /**
     * Give a product number find all divisor in increase order and concat it
     *
     * @param product
     *          {@code int}
     * @return
     *          {@code int}
     */
    int digitsProduct(int product) {
        ArrayList<Integer> answerDigits = new ArrayList<>();
        int answer = 0;

        if (product == 0) {
            return 10;
        }

        if (product == 1) {
            return 1;
        }

        for (int divisor = 9; divisor > 1; divisor--) {
            if (product % divisor == 0) {
                product /= divisor;
                answerDigits.add(divisor);
            }
        }

        if (product > 1) {
            return -1;
        }


        for (int i = answerDigits.size() - 1; i >= 0; i--) {
            answer = 10 * answer + answerDigits.get(i);
        }
        return answer;
    }

    boolean regularBracketSequence1(String s) {
        Matcher m = Pattern.compile("\\(\\w+\\)").matcher(s);
        while (m.matches()) {
            s = s.replaceFirst("\\(\\w+\\)", "");
        }
        return s.length() == 0;
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.replaceFirstDigitRegExp("There are 12 points");
        main.digitsProduct(450);
    }
}
