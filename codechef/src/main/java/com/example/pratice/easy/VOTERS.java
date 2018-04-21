package com.example.pratice.easy;

import java.util.*;

/**
 * Solution for VOTERS problem
 * @type
 *      hash array
 * @see
 *      <a href="https://www.codechef.com/problems/VOTERS">https://www.codechef.com/problems/VOTERS</a>
 * @author
 *      vi.tt
 */
public class VOTERS {
    /**
     * Idea: find a element appear more than 2 in 3 array
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        Map<Integer, Integer> voters1 = new HashMap<>();
        Map<Integer, Integer> voters2 = new HashMap<>();
        Map<Integer, Integer> voters3 = new HashMap<>();
        int[] finalVoters = new int[n1 + n2 + n3];
        int j = 0, value;

        for (int i = 0; i < n1; i++) {
            value = scanner.nextInt();
            voters1.put(value, i);
            finalVoters[j++] = value;
        }
        for (int i = 0; i < n2; i++) {
            value = scanner.nextInt();
            voters2.put(value, i);
            finalVoters[j++] = value;
        }
        for (int i = 0; i < n3; i++) {
            value = scanner.nextInt();
            voters3.put(value, i);
            finalVoters[j++] = value;
        }

        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n1 + n2 + n3; i++) {
            value = finalVoters[i];
            if (voters1.containsKey(value) && voters2.containsKey(value)
                    || voters1.containsKey(value) && voters3.containsKey(value)
                    || voters2.containsKey(value) && voters3.containsKey(value)) {
                voters1.remove(value);
                voters2.remove(value);
                voters3.remove(value);
                lst.add(value);
            }
        }

        Collections.sort(lst);

        System.out.println(lst.size());
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}
