class Solution {
    public int climbStairs(int n, int[] costs) {
        long[] dp = new long[n + 1];
        java.util.Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;

        for (int j = 1; j <= n; j++) {
            for (int step = 1; step <= 3; step++) {
                int i = j - step;
                if (i >= 0 && dp[i] != Long.MAX_VALUE) {
                    long cost = costs[j - 1] + (long) (j - i) * (j - i);
                    dp[j] = Math.min(dp[j], dp[i] + cost);
                }
            }
        }

        return (int) dp[n];
    }
}