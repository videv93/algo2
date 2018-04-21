package videv.codefights.introduce;

public class StringRearrangement {
    boolean stringsRearrangement(String[] inputArray) {
        return permutateAndCheckDiff(inputArray, 0, inputArray.length - 1);
    }
    void swap(String[] a, int i, int j) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    void print(String[] a, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i < n - 1)
                sb.append(a[i]).append(" ");
            else
                sb.append(a[i]);
        }
        System.out.println(sb.toString());
    }
    
    boolean permutateAndCheckDiff(String[] a, int start, int end) {
        if (start == end) {
            if (check(a, a.length)) {
                print(a, a.length);
                return true;
            }
        } else {
            for (int i = start; i <= end; i++) {
                swap(a, start, i);
                if (permutateAndCheckDiff(a, start + 1, end)) {
                    return true;
                }
                swap(a, i, start);
            }
        }
        return false;
    }
    boolean check(String[] a, int n) {
        boolean b = true;
        for (int i = 0; i < n - 1; i++) {
            int diff = 0;
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) != a[i+1].charAt(j)) {
                    diff++;
                }
            }
            if (diff != 1) {
                b = false;
                break;
            }
        }
        return b;
    }
}
