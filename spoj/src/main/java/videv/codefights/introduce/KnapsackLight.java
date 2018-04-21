package videv.codefights.introduce;

public class KnapsackLight {
    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        int value = 0;
        if (weight1 + weight2 <= maxW) {
            value = value1 + value2;
        } else if (weight1 <= maxW && value1 > value2) {
            value = value1;
        } else if (weight2 <= maxW && value2 > value1) {
            value = value2;
        } else {
            value = 0;
        }
        return value;
    }

    int unboundedKnapsack(int W, int n,
                                         int[] val, int[] wt) {
        // dp[i] is going to store maximum value
        // with knapsack capacity i.
        int dp[] = new int[W];

        // Fill dp[] using above recursive formula
        for(int i = 0; i < W; i++){
            for(int j = 0; j < n; j++){
                if(wt[j] <= i){
                    dp[i] = Math.max(dp[i], dp[i - wt[j]] +
                            val[j]);
                }
            }
        }
        return dp[W-1];
    }

}
