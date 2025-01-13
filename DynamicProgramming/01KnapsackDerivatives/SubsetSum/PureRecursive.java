public class PureRecursive {
    static Boolean isSubsetSum(int arr[], int target) {

        int result = recursive(arr, target, arr.length);
        if (result == 0)
            return false;
        else
            return true;
    }

    public static int recursive(int arr[], int sum, int n) {

        if (sum == 0)
            return 1;
        if (n == 0)
            return 0;

        if (arr[n - 1] <= sum) {
            return recursive(arr, sum - arr[n - 1], n - 1) | recursive(arr, sum, n - 1);
        } else {
            return recursive(arr, sum, n - 1);
        }
    }
}