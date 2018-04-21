package videv.codefights.introduce;

import java.util.HashSet;
import java.util.Set;

public class SquareDigitsSequence {
    int squareDigitsSequence(int a0) {
        Set<Integer> st = new HashSet<>();
        int ans = 1;
        st.add(a0);
        while (true) {
            a0 = sumSquareDigits(a0);
            if (st.contains(a0)) {
                ans++;
                break;
            } else {
                ans++;
                st.add(a0);
            }
        }
        return ans;
    }

    int sumSquareDigits(int n) {
        int s = 0;
        while (n > 0) {
            s += Math.pow(n % 10, 2);
            n /= 10;
        }
        return s;
    }

}
