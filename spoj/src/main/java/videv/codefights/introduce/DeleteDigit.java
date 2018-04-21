package videv.codefights.introduce;

public class DeleteDigit {
    int deleteDigit(int n) {
        int length = length(n);
        int max = 0;
        for (int i = 1; i < length + 1; i++) {
            int t = deleteOne(n, i);
            if (t > max) {
                max = t;
            }
        }
        return max;
    }

    int deleteOne(int n, int pos) {
        int ans = 0, i = 0, j = 0, length = length(n);
        while (n > 0) {
            if ((length - j) != pos) {
                ans += n % 10 * Math.pow(10, i);
                ++i;
            }
            j++;
            n /= 10;
        }
        return ans;
    }

    int length(int n) {
        int ans = 0;
        while (n > 0) {
            ans++;
            n /= 10;
        }
        return ans;
    }
}
