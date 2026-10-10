class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long totalK = (long) k1 + k2;
        int[] diffFreq = new int[100005];
        long totalDiffSum = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff > 0) {
                diffFreq[diff]++;
                totalDiffSum += diff;
                maxDiff = Math.max(maxDiff, diff);
            }
        }

        if (totalDiffSum <= totalK) {
            return 0;
        }

        for (int i = maxDiff; i > 0 && totalK > 0; i--) {
            if (diffFreq[i] > 0) {
                long take = Math.min(totalK, diffFreq[i]);
                diffFreq[i] -= take;
                diffFreq[i - 1] += take;
                totalK -= take;
            }
        }

        long minSumSquare = 0;
        for (int i = 1; i <= maxDiff; i++) {
            if (diffFreq[i] > 0) {
                minSumSquare += (long) diffFreq[i] * i * i;
            }
        }

        return minSumSquare;
    }
}
