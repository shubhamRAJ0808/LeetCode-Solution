class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < n; j++) {
                prod *= nums[j];
                gcd = Gcd(gcd, nums[j]);
                lcm = Lcm(lcm, nums[j]);

                if (prod == lcm * gcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

                if (prod > 2520L * gcd) {
                    break;
                }
            }
        }

        return maxLen;
    }

    private long Gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long Lcm(long a, long b) {
        return (a / Gcd(a, b)) * b;
    }
}