package videv.codefights.introduce;

public class LineUp {

    public static final int S = 1;

    int lineUp(String commands) {
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }

        int ans = 0;
        for (int i = 0; i < commands.length(); i++) {
            if (commands.charAt(i) == 'L') {
                for (int j = 0; j < a.length; j++) {
                    if (j == S) {
                        --a[j];
                    } else {
                        ++a[j];
                    }
                    if (a[j] < 0) {
                        a[j] = 3;
                    } else if (a[j] > 3) {
                        a[j] = 0;
                    }
                }
            } else if (commands.charAt(i) == 'R') {
                for (int j = 0; j < a.length; j++) {
                    if (j == S) {
                        ++a[j];
                    } else {
                        --a[j];
                    }
                    if (a[j] < 0) {
                        a[j] = 3;
                    } else if (a[j] > 3) {
                        a[j] = 0;
                    }
                }
            } else if (commands.charAt(i) == 'A') {
                for (int j = 0; j < a.length; j++) {
                    a[j] += 2;

                    if (a[j] > 3) {
                        a[j] %= 4;
                    }
                }
            } else {
                continue;
            }

            boolean b = true;
            for (int j = 1; j < a.length; j++) {
                if (a[j] != a[j-1]) {
                    b = false;
                    break;
                }
            }
            if (b) {
                ans++;
            }
        }
        return ans;
    }

}
