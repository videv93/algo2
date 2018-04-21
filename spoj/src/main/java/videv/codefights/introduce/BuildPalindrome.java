package videv.codefights.introduce;

public class BuildPalindrome {
    String buildPalindrome(String s) {
        int i = 0;
        while (i < s.length() && !isPalindrome(s.substring(i, s.length()))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int j = 0; j < i; j++) {
                sb.append(s.charAt(j));
            }
        }
        return s.concat(sb.reverse().toString());
    }

    boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < s.length() && j >= 0 && s.charAt(i) == s.charAt(j)) { i++; j--; }
        return i >= j;
    }

}
