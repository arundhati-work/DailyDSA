public class PureRecursive {
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        return recursive(val, wt, capacity, wt.length);
    }

    static int recursive(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0)
            return 0;

        if (wt[n - 1] <= W) {
            return Math.max(val[n - 1] + recursive(val, wt, W - wt[n - 1], n - 1), recursive(val, wt, W, n - 1));
        } else {
            return recursive(val, wt, W, n - 1);
        }
    }
}
