package videv.codefights.introduce;

public class ArrayMaxConsecutiveSum {
    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int n = inputArray.length;
        int max = -1;
        for (int i = 0; i < n - k + 1; i++) {
            int s = 0;
            for (int j = i; j < i + k; j++) {
                s += inputArray[j];
            }
            if (s > max) {
                max = s;
            }
        }
        return max;
    }
}
