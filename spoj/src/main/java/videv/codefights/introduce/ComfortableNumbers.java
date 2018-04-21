package videv.codefights.introduce;

public class ComfortableNumbers {
    int comfortableNumbers(int l, int r) {
        int ans = 0;
        for (int i = l + 1; i < r + 1; i++) {
            for (int j = l; j < i; j++) {
                if (range(i, j)) {
//                    System.out.println(j + " " + i);
                    ++ans;
                }
            }
        }

        return ans;
    }

    int pair(int l, int r) {
        int ans = 0;
        for (int i = l + 1; i < r + 1; i++) {
            for (int j = l; j < i; j++) {
                if (range(i, j))
                System.out.println(j + " " + i);
                ++ans;
            }
        }

        return ans;
    }

    boolean range(int a, int b) {
        int sa = sum(a);
        int sb = sum(b);
        return (b >= (a - sa) && b <= (a + sa))
                && (a >= (b - sb) && a <= (b + sb));
    }

    int sum(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
}
