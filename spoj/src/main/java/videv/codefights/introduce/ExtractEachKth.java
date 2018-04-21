package videv.codefights.introduce;

import java.util.ArrayList;
import java.util.List;

public class ExtractEachKth {
    int[] extractEachKth(int[] inputArray, int k) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (k == 1){
                continue;
            } else if (i > 0 && (i+1) % k == 0) {
                continue;
            }
            lst.add(inputArray[i]);
        }

        int[] ans = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            ans[i] = lst.get(i);
        }
        return ans;
    }

}
