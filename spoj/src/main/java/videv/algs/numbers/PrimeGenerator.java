package videv.algs.numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {
    /**
     * Generate list of prime numbers from 2 to n.
     */
    public static List<Integer> sieve(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p < n; p++) {
            if (primes[p]) {
                for (int i = 2 * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        List<Integer> lst = new ArrayList<>();
        for (int i = 2; i < n + 1; i++) {
            if (primes[i]) {
                lst.add(i);
            }
        }
        return lst;
    }
}
