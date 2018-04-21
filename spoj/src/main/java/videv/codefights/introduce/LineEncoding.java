package videv.codefights.introduce;

import java.util.ArrayList;
import java.util.List;

public class LineEncoding {
    String lineEncoding(String s) {
        String[] str = phase1Update(s);
        for (int i = 0; i < str.length; i++) {
            str[i] = phase2(str[i]);
        }
        return String.join("", str);
    }

    String[] phase1Update(String s) {
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < s.length();) {
            int j;
            for (j = i; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    break;
                }
            }
            lst.add(s.substring(i, j));
            i = j;
        }
        return lst.toArray(new String[] {});
    }

    String[] phase1(String s) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }

        List<String> lst = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                lst.add(repeat((char) ('a' + i), a[i]));
            }
        }
        return lst.toArray(new String[] {});
    }

    String repeat(char c, int times) {
        return repeat(String.valueOf(c), times);
    }

    String repeat(String s, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    String phase2(String s) {
        if (s.length() < 2) {
            return s;
        }
        return s.length() + s.substring(0,1);
    }
}
