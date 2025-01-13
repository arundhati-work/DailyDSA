public class RecursiveWithMemo {
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
                if (i != 0 && j != 0) {
                    dp[i][j] = -1;
                }
            }
        }

        int result = recursive(arr, dp, target, arr.length);
        if (result == 0)
            return false;
        else
            return true;
    }

    public static int recursive(int arr[], int dp[][], int sum, int n) {

        if (sum == 0)
            return 1;
        if (n == 0)
            return 0;

        if (dp[n][sum] != -1)
            return dp[n][sum];

        if (arr[n - 1] <= sum) {
            dp[n][sum] = recursive(arr, dp, sum - arr[n - 1], n - 1) | recursive(arr, dp, sum, n - 1);
        } else {
            dp[n][sum] = recursive(arr, dp, sum, n - 1);
        }
        return dp[n][sum];
    }
}
