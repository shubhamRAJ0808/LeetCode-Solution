class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            arr[i][0] = nums[i];
            arr[i][1] = sum;
        }
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, (a, b) -> {
            if (arr[a][1] != arr[b][1]) {
                return arr[a][1] - arr[b][1];
            }
            return arr[a][0] - arr[b][0];
        });

        int[] target = new int[n];

        for (int i = 0; i < n; i++) {
            target[idx[i]] = i;
        }

        int swaps = 0;

        for (int i = 0; i < n; i++) {
            while (target[i] != i) {
                int j = target[i];

                int temp = target[i];
                target[i] = target[j];
                target[j] = temp;

                swaps++;
            }
        }

        return swaps;
    }
}