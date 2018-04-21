package videv.codefights.introduce;

import java.util.HashSet;
import java.util.Set;

public class DifferentSymbolsNaive {
    int differentSymbolsNaive(String s) {
        Set<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }
        return st.size();
    }

}
