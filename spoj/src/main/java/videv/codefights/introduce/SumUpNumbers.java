package videv.codefights.introduce;

public class SumUpNumbers {
    int sumUpNumbers(String inputString) {
        int ans = 0;
        for (int i = 0; i < inputString.length();) {
            int j;
            for (j = i; j < inputString.length(); j++) {
                char c = inputString.charAt(j);
                if (!Character.isDigit(c)) {
                    break;
                }
            }
            if (j > i) {
                String s = inputString.substring(i, j);
                ans += Integer.parseInt(s);
            } else {
                ++j;
            }

            i = j;
        }
        return ans;
    }

}
