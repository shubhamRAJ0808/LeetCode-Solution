
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if (n == 1) return 0;
        char[] arr = s.toCharArray();
        boolean sort = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sort = false;
                break;
            }
        }
        if (sort) return 0;
        if (n == 2) return -1;
        char min = 'z';
        char max = 'a';
        for (int i = 0; i < n; i++) {
            min = (char) Math.min(min, arr[i]);
            max = (char) Math.max(max, arr[i]);
        }

        if (arr[0] == min || arr[n - 1] == max) {
            return 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] == min || arr[i] == max) {
                return 2;
            }
        }
        return 3;
    }
}
