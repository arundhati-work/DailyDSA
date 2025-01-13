public class TopDown {
    static Boolean isSubsetSum(int arr[], int target) {
        // code here
        int[][] dp = new int[arr.length + 1][target + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < target + 1; j++) {
                if (i == 0) {
                    dp[i][j] = 0;
                }
                if (j == 0) {
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] | dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        if (dp[arr.length][target] == 0)
            return false;
        else
            return true;
    }
}
