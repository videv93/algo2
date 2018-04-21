package videv.codefights.introduce;

public class ReplaceMiddle {
    int[] replaceMiddle(int[] arr) {
        int n = arr.length;
        if (n % 2 == 0) {
            int mid = n / 2;
            int replace = arr[mid] + arr[mid - 1];
            int[] arr1 = new int[n - 1];
            for (int i = 0; i < n; i++) {
                if (i == mid) {
                    continue;
                }
                if (i == mid - 1) {
                    arr1[i] = replace;
                } else if (i < mid - 1) {
                    arr1[i] = arr[i];
                } else {
                    arr1[i-1] = arr[i];
                }
            }
            return arr1;
        } else {
            return arr;
        }
    }

}
