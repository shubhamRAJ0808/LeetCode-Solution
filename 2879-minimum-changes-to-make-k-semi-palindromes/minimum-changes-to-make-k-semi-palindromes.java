class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int[][] cost = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                cost[i][j] = getCost(s, i, j);
            }
        }
        
        int[][] dp = new int[n + 1][k + 1];
        int INF = 1000000;
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][0] = 0;
        
        for (int j = 1; j <= k; j++) {
            for (int i = 2 * j; i <= n; i++) {
                for (int p = 2 * (j - 1); p <= i - 2; p++) {
                    if (dp[p][j - 1] != INF) {
                        dp[i][j] = Math.min(dp[i][j], dp[p][j - 1] + cost[p][i - 1]);
                    }
                }
            }
        }
        
        return dp[n][k];
    }
    
    private int getCost(String s, int start, int end) {
        int len = end - start + 1;
        int minChanges = len;
        
        for (int d = 1; d < len; d++) {
            if (len % d == 0) {
                int changes = 0;
                for (int offset = 0; offset < d; offset++) {
                    int left = start + offset;
                    int right = end - (d - 1 - offset);
                    while (left < right) {
                        if (s.charAt(left) != s.charAt(right)) {
                            changes++;
                        }
                        left += d;
                        right -= d;
                    }
                }
                minChanges = Math.min(minChanges, changes);
            }
        }
        
        return minChanges;
    }
}