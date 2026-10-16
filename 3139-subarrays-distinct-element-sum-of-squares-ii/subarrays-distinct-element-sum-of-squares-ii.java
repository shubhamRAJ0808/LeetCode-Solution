class Solution {
    static final long MOD = 1_000_000_007L;
    long[] sum, sq, lazy;
    int[] len;

    void build(int o, int l, int r) {
        len[o] = r - l + 1;
        if (l == r) return;
        int m = (l + r) / 2;
        build(2 * o, l, m);
        build(2 * o + 1, m + 1, r);
    }

    void apply(int o, long a) {
        sq[o] = (sq[o] + 2 * a % MOD * sum[o] + a * a % MOD * len[o]) % MOD;
        sum[o] = (sum[o] + a * len[o]) % MOD;
        lazy[o] = (lazy[o] + a) % MOD;
    }

    void push(int o) {
        if (lazy[o] != 0) {
            apply(2 * o, lazy[o]);
            apply(2 * o + 1, lazy[o]);
            lazy[o] = 0;
        }
    }

    void update(int o, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr) { apply(o, 1); return; }
        push(o);
        int m = (l + r) / 2;
        if (ql <= m) update(2 * o, l, m, ql, qr);
        if (qr > m) update(2 * o + 1, m + 1, r, ql, qr);
        sum[o] = (sum[2 * o] + sum[2 * o + 1]) % MOD;
        sq[o] = (sq[2 * o] + sq[2 * o + 1]) % MOD;
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;
        sum = new long[4 * n];
        sq = new long[4 * n];
        lazy = new long[4 * n];
        len = new int[4 * n];
        build(1, 0, n - 1);

        HashMap<Integer, Integer> last = new HashMap<>();
        long ans = 0;
        for (int r = 0; r < n; r++) {
            int prev = last.getOrDefault(nums[r], -1);
            update(1, 0, n - 1, prev + 1, r);   
            ans = (ans + sq[1]) % MOD;          
            last.put(nums[r], r);
        }
        return (int) ans;
    }
}