public class RecursiveWithMemo {
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int dp[][] = new int[wt.length + 1][capacity + 1];

        for (int i = 0; i < wt.length + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                dp[i][j] = 0;
            }
        }
        return recursive(val, wt, dp, capacity, wt.length);
    }

    static int recursive(int val[], int wt[], int[][] dp, int W, int n) {
        if (W == 0 || n == 0)
            return 0;
        if (dp[n][W] != 0)
            return dp[n][W];
        if (wt[n - 1] <= W) {
            dp[n][W] = Math.max(val[n - 1] + recursive(val, wt, dp, W - wt[n - 1], n - 1),
                    recursive(val, wt, dp, W, n - 1));
        } else {
            dp[n][W] = recursive(val, wt, dp, W, n - 1);
        }
        return dp[n][W];
    }
}
