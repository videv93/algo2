package videv.codefights.introduce;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    int makeArrayConsecutive2(int[] statues) {
        int min = 20, max = 0;
        for (int i = 0; i < statues.length; i++) {
            if (statues[i] > max) {
                max = statues[i];
            }
            if (statues[i] < min) {
                min = statues[i];
            }
        }
        int ans = 0;
        Arrays.sort(statues);
        int j = 0;
        for (int i = min; i < max + 1; i++) {
            if (i == statues[j]) {
                ++j;
                continue;
            }
            ++ans;
        }
        return ans;
    }

}
