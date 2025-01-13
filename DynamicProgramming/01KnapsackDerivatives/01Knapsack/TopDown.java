public class TopDown {
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int dp[][] = new int[wt.length + 1][capacity + 1];

        for (int i = 0; i < wt.length + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 1; i < wt.length + 1; i++) {
            for (int j = 1; j < capacity + 1; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[wt.length][capacity];
    }
}
