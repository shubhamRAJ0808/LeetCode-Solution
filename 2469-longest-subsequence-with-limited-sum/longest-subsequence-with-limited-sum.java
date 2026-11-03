class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
                if (sum <= queries[i]) {
                    count++;
                } else {
                    break;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}