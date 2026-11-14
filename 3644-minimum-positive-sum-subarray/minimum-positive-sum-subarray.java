class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }
        int minSum = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            for (int len = l; len <= r; len++) {
                if (i + len <= n) {
                    int currSum = prefix[i + len] - prefix[i];
                    if (currSum > 0) {
                        minSum = Math.min(minSum, currSum);
                    }
                }
            }
        }
        
        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}
