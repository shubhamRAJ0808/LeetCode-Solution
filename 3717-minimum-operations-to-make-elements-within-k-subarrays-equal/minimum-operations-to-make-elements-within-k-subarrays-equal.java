import java.util.*;

class Solution {
    int size;
    int[] cnt;
    long[] sum;
    long[] vals;
    int top;

    void update(int i, int c, long v) {
        for (; i <= size; i += i & -i) {
            cnt[i] += c;
            sum[i] += v;
        }
    }

    long[] find(int t) {
        int pos = 0, c = 0;
        long s = 0;
        for (int pw = top; pw > 0; pw >>= 1) {
            int np = pos + pw;
            if (np <= size && c + cnt[np] < t) {
                pos = np;
                c += cnt[np];
                s += sum[np];
            }
        }
        return new long[]{pos, c, s};
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        int m = x / 2;

        vals = Arrays.stream(nums).distinct().sorted().asLongStream().toArray();
        size = vals.length;
        cnt = new int[size + 1];
        sum = new long[size + 1];
        top = Integer.highestOneBit(size);

        int[] idx = new int[n];
        for (int i = 0; i < n; i++) {
            idx[i] = Arrays.binarySearch(vals, nums[i]) + 1;
        }

        long total = 0;
        for (int i = 0; i < x; i++) {
            update(idx[i], 1, nums[i]);
            total += nums[i];
        }

        long[] cost = new long[n - x + 1];
        for (int s = 0; s + x <= n; s++) {
            long[] a = find(m + 1);
            long med = vals[(int) a[0]];
            long low = 0;
            if (m > 0) {
                long[] b = find(m);
                low = b[2] + (m - b[1]) * vals[(int) b[0]];
            }
            cost[s] = med * m - low + (total - low - med) - med * (x - m - 1);
            if (s + x < n) {
                update(idx[s], -1, -nums[s]);
                update(idx[s + x], 1, nums[s + x]);
                total += nums[s + x] - nums[s];
            }
        }

        long INF = Long.MAX_VALUE / 2;
        long[] prev = new long[n + 1];
        for (int j = 1; j <= k; j++) {
            long[] cur = new long[n + 1];
            Arrays.fill(cur, INF);
            for (int i = 1; i <= n; i++) {
                cur[i] = cur[i - 1];
                if (i >= x && prev[i - x] < INF) {
                    cur[i] = Math.min(cur[i], prev[i - x] + cost[i - x]);
                }
            }
            prev = cur;
        }
        return prev[n];
    }
}