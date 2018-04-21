package com.example.headtohead;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;

public class Main {
    static int[] listWithoutLoop(int n) {
        int m = n;
        List<Integer> list = new ArrayList<>();
        while (m >= 5) {
            list.add(m);
            m-=5;
        }
        list.add(m);
        while (m <= n) {
            list.add(m);
            m += 5;
        }
        Function<Integer[], int[]> unboxed = (x)-> Arrays.stream(x).mapToInt(Integer::intValue).toArray();
        return unboxed.apply(list.toArray(new Integer[list.size()]));
    }

    static int avoidObstacles(int[] arr) {
        Arrays.sort(arr);
        int last = arr[arr.length - 1];
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            boolean f = true;
            for (int j = i; j <= last; j+= i) {
                if (contains(arr, j)) {
                    f = false;
                    break;
                }
            }

            if (f) {
                return i;
            }
        }
        return 0;
    }

    private static boolean contains(int[] arr, int j) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {
                b = true;
                break;
            }
        }
        return b;
    }

    static int[][] boxBlur(int[][] image) {
        int[][] res = new int[image.length - 2][image[0].length - 2];
        for (int i = 1; i < image.length - 1; i++) {
            for (int j = 1; j < image[i].length - 1; j++) {
                int s = image[i-1][j-1] + image[i-1][j] + image[i-1][j+1] +
                        image[i][j-1] + image[i][j] + image[i][j+1] +
                        image[i+1][j-1] + image[i+1][j] + image[i+1][j+1];

                res[i-1][j-1] = s / 9;
            }
        }
        return res;
    }

    static int chartFix(int[] chart) {
        ArrayList<Integer> toRemove = new ArrayList<>();
        for (int i = 0; i < chart.length; i++) {
            int cur = i;
            for (int j = 0; j < i; j++) {
                if (chart[j] < chart[i]) {
                    cur = Math.min(cur, toRemove.get(i-1) + i - j - 1);
                }
            }
            toRemove.add(cur);
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < toRemove.size(); i++) {
            res = Math.min(res, toRemove.get(toRemove.size() - i - 1) + i);
        }
        return res;
    }

    static boolean charactersRearrangement(String string1, String string2) {
        boolean correct = true;

        char[] characters1 = string1.toCharArray();
        char[] characters2 = string1.toCharArray();

        Arrays.sort(characters1);
        Arrays.sort(characters2);

        for (int i = 0; i < Math.max(characters1.length, characters2.length); i++) {
            if (i >= characters1.length || i >= characters2.length || characters1[i] != characters2[i]) {
                correct = false;
                break;
            }
        }

        return correct;
    }

    static int[][] spiralNumbers(int n) {
        int[][] m = new int[n][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int currentDirectionIndex = 0;
        int currentRow = 0;
        int currentColumn = 0;
        int currentNum = 1;
        int tmpRow;
        int tmpColumn;
        for(int i = n * n; i > 0; i--) {
            m[currentRow][currentColumn] = currentNum;
            currentNum++;
            if(i > 1) {
                tmpRow = directions[currentDirectionIndex][0];
                tmpColumn = directions[currentDirectionIndex][1];
                while(true) {
                    if(tmpRow < 0 || tmpRow >= n || tmpColumn < 0 || tmpColumn >= n ||
                            m[tmpRow][tmpColumn] != 0) {
                        currentDirectionIndex = (currentDirectionIndex + 1) % 4;
                    } else {
                        currentRow = tmpRow;
                        currentColumn = tmpColumn;
                        break;
                    }
                }
            }
        }
        return m;
    }

    String[][][] proCategorization(String[] pros, String[][] pref) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < pref.length && i < pros.length ; i++) {
            for (int j = 0; j < pref[i].length; j++) {
                if (!map.containsKey(pref[i][j])) {
                    List<String> lst = new ArrayList<>();

                    map.put(pref[i][j], lst);
                }
            }
        }
        return null;
    }

    static int sequencePeakElement(int[] sequence) {
        int left = 0;
        int right = sequence.length - 2;
        while (left < right) {
            int middle = (left + right) / 2;
            if (sequence[middle] > Math.max(sequence[middle - 1], sequence[middle + 1])) {
                left = right = middle;
                break;
            }
            if (sequence[middle - 1] < sequence[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return sequence[left];
    }


    int cyclicString(String s1) {
        for (int answer = 1; answer < s1.length(); answer++) {
            boolean correct = true;
            for (int position = answer; position < s1.length(); position++) {
                if (s1.charAt(position) != s1.charAt(position - answer)) {

                }
            }
            if (correct) {
                return answer;
            }
        }
        return s1.length();
    }

    static int twoArraysNthElement(int[] array1, int[] array2, int n) {

        class Helper {
            int lowerBound(int[] arr, int elem) {
                int l = -1;
                int r = arr.length;
                while (l + 1 < r) {
                    int mid = (l + r) / 2;
                    if (arr[mid] <= elem) {
                        l = mid;
                    }
                    else {
                        r = mid;
                    }
                }
                return l;
            }
        };

        int l = -1;
        int r = array1.length;

        Helper h = new Helper();

        while (l + 1 < r) {
            int mid = (l + r) / 2;
            int pos = h.lowerBound(array1, array1[mid]);

            if (mid + pos + 1 <= n) {
                l = mid;
            }
            else {
                r = mid;
            }
        }

        if (l > -1 && l + h.lowerBound(array2, array1[l]) + 1 == n) {
            return array1[l];
        }
        return twoArraysNthElement(array2, array1, n);
    }

    /**
     * Find a index of element smaller than elem in sorted array.
     *
     * @param arr
     *      {@code int[]}
     *
     * @param elem
     *      {@code int}
     *
     * @return
     *      {@code int}
     */
    static int lowerBound(int[] arr, int elem) {
        int l = -1;
        int r = arr.length;
        while (l + 1 < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= elem) {
                l = mid;
            }
            else {
                r = mid;
            }
        }
        return l;
    }

    static int countWays(int n, int k) {
        final int MOD = (int)1e9 + 7;

        ArrayList<ArrayList<Integer>> c_nk = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            c_nk.add(new ArrayList<Integer>());
            for (int j = 0; j <= k; j++) {
                c_nk.get(i).add(0);
            }
        }
        c_nk.get(0).set(0, 1);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> cur = c_nk.get(i);
            ArrayList<Integer> next = c_nk.get(i + 1);
            for (int j = 0; j <= k; j++) {
                if (i + 1 <= n) {
                    next.set(j, (next.get(j) + cur.get(j)) % MOD);
                    if (j + 1 <= k) {
                        next.set(j + 1, (next.get(j + 1) + cur.get(j)) % MOD);
                    }
                }
            }
        }

        return c_nk.get(n).get(k);
    }

    static int[] videoPart(String part, String total) {
        class Helper {
            int getSeconds(String time) {
                int h = Integer.parseInt(time.substring(0, 2)),
                        m = Integer.parseInt(time.substring(3, 5)),
                        s = Integer.parseInt(time.substring(6, 8));
                return h * 60 * 60 + m * 60 + s;
            }

            int gcd(int a, int b) {
                while (a > 0) {
                    int tmp = a;
                    a = b % a;
                    b = tmp;
                }
                return b;
            }
        }
        Helper h = new Helper();

        int partTime = h.getSeconds(part);
        int totalTime = h.getSeconds(total);
        int divisor = h.gcd(partTime, totalTime);
        return new int[] {totalTime / partTime, 1};
    }

    /**
     * Find median of an array
     *
     * @param sequence
     *          {@code sequence}
     * @return
     *          {@code double}
     */
    static double arrayMedian(int[] sequence) {
        Arrays.sort(sequence);
        int mid = (-1 + sequence.length) / 2;
        if (sequence.length % 2 != 0) {
            return sequence[mid];
        }
        return (sequence[mid] + sequence[mid + 1]) / 2;
    }

    /**
     * Given 3 number in left pocket, find possible amount of numbers
     *
     * if you move numbers from left to right.
     *
     * It is possible to move zero to 2, not all of them.
     *
     * @param a
     *          {@code int}
     * @param b
     *          {@code int}
     * @param c
     *          {@code int}
     * @return
     *          {@code int}
     */
    int calculationsWithCoins(int a, int b, int c) {
        Set<Integer> st = new HashSet<>();
        st.add(a);
        st.add(b);
        st.add(c);
        st.add(a+b);
        st.add(b+c);
        st.add(c+a);

        return st.size();
    }

    /**
     * Add an asterisks to String array
     *
     * @param picture
     *          {@code String[]}
     * @return
     *          {@code String[]}
     */
    String[] addBorder(String[] picture) {

        List<String> answer = new ArrayList<>();
        answer.add("");

        for (int i = 0; i < picture[0].length() + 2; i++) {
            answer.set(0, answer.get(0) + "*");
        }

        for (int i = 0; i < picture.length; i++) {
            answer.add("*");
            for (int j = 0; j < picture[0].length(); j++) {
                answer.set(i, answer.get(i) + picture[i].charAt(j));
            }
            answer.set(i + 1, answer.get(i + 1) + "*");
        }

        answer.add(answer.get(0));

        return answer.toArray(new String[picture.length + 2]);
    }

    /**
     * Given integers n and k, find the number of strictly increasing sequences
     *
     * of length n consisting of positive integers not exceeding k
     *
     * @param n
     *          {@code int}
     * @param k
     *          {@code int}
     * @return
     *          {@code int}
     */
    int countIncreasingSequences(int n, int k) {
        /**
         * vector dp (short for dynamic programming)
         * is used for storing the interim values.
         */
        int[] line = new int[k + 1];
        int[][] dp = new int[n + 1][line.length];
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                for (int q = 0; q < j; q++) {
                    dp[i][j] +=  1;
                }
            }
        }

        int sum = 0;
        for (int j = 1; j <= k; j++) {
            sum += dp[n][j];
        }

        return sum;
    }

    /**
     *
     * @param a
     * @param b
     * @param n
     * @return
     */
    String addDigits(int a, int b, int n) {

        int rem = a % b;

        StringBuilder result = new StringBuilder();
        result.append(rem);

        for (int i = 0; i < n; i++) {
            int best = -1;
            for (int digit = 9; digit >= 0; digit--) {
                if ((rem * 10 + digit) % b == 0) {
                    best = digit;
                    break;
                }
            }
            if (best == -1) {
                break;
            }
            result.append(best);
            rem = (rem * 10 + best) % b;
        }

        return result.toString();
    }

    /**
     * Given a sequence, check whether it is cyclic increasing
     *
     * @param arr
     *      {@code int[]}
     *
     * @return
     *      {@code boolean}
     */
    boolean cyclicSequence(int[] arr) {
        class Helper {
            void shiftArray(int[] arr) {
                int last = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i-1];
                }
                arr[0] = last;
            }
            boolean isIncrease(int[] arr) {
                boolean b = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i+1]) {
                        b = false;
                        break;
                    }
                }
                return b;
            }
        }

        Helper helper = new Helper();
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (helper.isIncrease(arr)) {
                b = true;
                break;
            } else {
                helper.shiftArray(arr);
            }
        }
        return b;
    }

    /**
     * Given a sequence, check whether it is cyclic increasing
     *
     * @param arr
     *      {@code int[]}
     *
     * @return
     *      {@code boolean}
     */
    boolean cyclicSequenceBetter(int[] arr) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            boolean l = true;
            for (int j = 0; j < i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    l = false;
                    break;
                }
            }

            boolean r = true;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    r = false;
                    break;
                }
            }

            if (l && r && arr[arr.length - 1] < arr[0]) {
                b = true;
                break;
            }
        }
        return b;
    }

    /**
     *
     * @param a
     * @param n
     * @param m
     * @return
     */
    int summaryProficiency(int[] a, int n, int m) {

        int result = 0;
        for (int i = 0; n > 0; i++) {
            if (a[i] >= m) {
                result +=  a[i] ;
                n--;
            }
        }

        return result;
    }

    /**
     * Given an integer n, check if it's possible to increase n's roundness by swapping some pair of its digits.
     *
     * @param n
     *
     * @return
     */
    boolean increaseNumberRoundness(int n) {
        boolean gotToSignificant = false;
        while (n > 0) {
            if (n % 10 == 0 && gotToSignificant) {
                return true;
            } else if (n % 10 != 0) {
                gotToSignificant = true;
            }
            n /= 10;
        }

        return false;
    }

    /**
     * For a given integer n, return the shortest possible list of distinct Fibonacci numbers
     * that sum up to n, sorted in ascending order.
     *
     * @param n
     *      {@code int}
     * @return
     *      {@code int[]}
     */
    int[] fibonacciSum(int n) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(1);
        for (int i = 2; i < n; i++) {
            int cur = lst.get(i-1) + lst.get(i-2);
            if (cur > n) {
                break;
            } else {
                lst.add(cur);
            }
        }
        Integer[] arr = lst.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr));

        return null;

    }

    boolean coolString(String inputString) {

        class Helper {
            boolean isLowercase(char symbol) {
                if ('a' <= symbol && symbol <= 'z') {
                    return true;
                }
                return false;
            }

            boolean isUppercase(char symbol) {
                if ('A' <= symbol && symbol <= 'Z') {
                    return true;
                }
                return false;
            }
        }
        Helper h = new Helper();

        boolean firstIsLowercase = h.isLowercase(inputString.charAt(0));
        boolean firstIsUppercase = h.isUppercase(inputString.charAt(0));

        if (!(firstIsLowercase || firstIsUppercase)) {
            return false;
        }

        for (int i = 1; i < inputString.length(); i++) {
            if (i % 2 == 0) {
                if (h.isLowercase(inputString.charAt(i)) == firstIsLowercase ||
                        h.isUppercase(inputString.charAt(i)) == firstIsUppercase) {
                    return false;
                }
            } else {
                if (h.isLowercase(inputString.charAt(i)) != firstIsLowercase ||
                        h.isUppercase(inputString.charAt(i)) != firstIsUppercase) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     *
     * @param word
     * @param letters
     * @return
     */
    boolean hangman(String word, String letters) {

        boolean[] neededLetters = new boolean[26];
        int need = 0;
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if (!neededLetters[c]) {
                neededLetters[c] = true;
                need++;
            }
        }

        int missed = 0;
        for (int i = 0; i < letters.length() && missed < 6 && need > 0; i++) {
            int c = letters.charAt(i) - 'a';
            if (neededLetters[c]) {
                neededLetters[c] = false;
                need--;
            } else {
                missed++;
            }
        }

        return need > 0;
    }

    /**
     *
     * @param s
     *
     * @return
     *
     */
    String truncateString(final String s) {
        class Helper {
            String truncate(int l, int r) {
                if (l >= r) {
                    return "";
                }
                int newL = l;
                int newR = r;
                int left = s.charAt(l) - '0';
                int right = s.charAt(r - 1) - '0';
                if (left % 3 == 0) {
                    newL++;
                } else if (right % 3 == 0) {

                } else if ((left + right) % 3 == 0) {
                    newL++;
                    newR--;
                } else {
                    return s.substring(l, r);
                }

                return truncate(newL, newR);
            }
        }
        Helper h = new Helper();

        return h.truncate(0, s.length());
    }

    /**
     * Return an array of names that will be given to the files.
     *
     * @param names
     *
     * @return
     *
     */
    ArrayList<String> fileNaming(String[] names) {
        class HashMapElement {
            String element;
            int hash;
            int version; //the smallest possible integer to use with this name

            HashMapElement(String a, int b, int c) {
                element = a;
                hash = b;
                version = c;
            }
        };

        class Helper {
            /*
              Information about the string in the hash map
              is stored in the following way:
              [string itself,
               its hash,
               the smallest possible integer to use with this name]
            */
            int hashMapSize;
            HashMapElement[] hashMap;

            Helper(int halfSize) {
                hashMapSize = halfSize * 2;
                hashMap = new HashMapElement[hashMapSize];
                for (int i = 0; i < hashMapSize; i++) {
                    hashMap[i] = new HashMapElement("", -1, 0);
                }
            }

            int calculateHash(String inputString) {
                final int P = 997;
                final int M = 28001;
                int hashValue = 0;
                for (int i = 0; i < inputString.length(); i++) {
                    hashValue = (hashValue * P + (int)inputString.charAt(i)) % M;
                }
                return hashValue;
            }

            int searchHM(int position, int hash) {
                while (hashMap[position].element != ""
                        && hashMap[position].hash != hash) {
                    position = (position + 1) % hashMapSize;
                }
                return position;
            }
        }

        ArrayList<String> result = new ArrayList<>();
        Helper h = new Helper(names.length);

        for (int i = 0; i < names.length; i++) {
            int hash = h.calculateHash(names[i]);
            int startPos = h.searchHM(hash % h.hashMapSize, hash);
            if (h.hashMap[startPos].element == "") {
                h.hashMap[startPos] = new HashMapElement(names[i], hash, 1);
                result.add(names[i]);
            }
            else {
                String newName = names[i] + "(" +
                        Integer.toString(h.hashMap[startPos].version) + ")";
                int newNameHash = h.calculateHash(newName);
                int position = h.searchHM(newNameHash % h.hashMapSize, newNameHash);

                while (h.hashMap[position].element != "") {
                    h.hashMap[startPos].version++;
                    newName = names[i] + "(" +
                            Integer.toString(h.hashMap[startPos].version) + ")";
                    newNameHash = h.calculateHash(newName);
                    position = h.searchHM(newNameHash % h.hashMapSize, newNameHash);
                }
                result.add(newName);
                h.hashMap[startPos].version++;
            }
        }
        return result;
    }

    /**
     * Given an integer n, you can remove either its first or last digit in one step.
     * After applying this operation several times, you'll get a number x with a length of k.
     * It's possible that the number will contain leading zeros.
     * What is the minimal and the maximal possible value of x that you can obtain?
     * @param n
     * @param k
     * @return
     */
    long[] removeDigits(long n, int k) {
        int min_index = 0, max_index = 0;
        char[] c = String.valueOf(n).toCharArray();
        for (int i = 1; i < c.length; i++) {
            if (c[i] > c[max_index] && i < c.length) {
                max_index = i;
            } else if (c[i] < c[min_index]  && i < c.length) {
                min_index = i;
            }
        }

        StringBuilder builder = new StringBuilder();
        int max = Integer.parseInt(builder.append(c, max_index, k).toString());
        builder = new StringBuilder();
        int min = Integer.parseInt(builder.append(c, min_index, k).toString());

        return new long[] {min, max};
    }

    /**
     * Find the index of last element in fibonacci sequence less than 10 ^ n
     *
     * @param n
     *          {@coode int} -
     * @return
     *          {@code int} - lastest index of element less than 10 ^ n
     */
    int fibonacciIndex(int n) {
        int b = 0, a = 1, t = 0, c = 2;
        while (a < Math.pow(10, n-1)) {
            t = a;
            a = a + b;
            b = t;
            c++;
        }
        return c;
    }

    /**
     * Given a set of complex values, find their product.
     * @param real
     * @param imag
     * @return
     */
    int[] arrayComplexElementsProduct(int[] real, int[] imag) {
        if (real.length != imag.length) {
            return null;
        }
        int a = 1, b = 1;;
        for (int i = 0; i < real.length; i++) {
            a *= real[i];
            b *= imag[i];
        }

        return new int[] {a-b, real[0] * imag[1] + real[1] * imag[0]};
    }

    /**
     * Recursion method to evalute product of ccomplex values
     * @param real
     * @param imag
     * @return
     */
    int[] eval1(int[] real, int[] imag) {
        if (real.length == 2 && imag.length == 2) {
            int rreal = real[0] * real[1] - imag[0] * imag[1];
            int rimag = real[0] * imag[1] + real[1] * imag[0];
            return new int[] {rreal, rimag};
        } else {
            return eval1(real, imag);
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.fibonacciIndex(10));
    }
}
