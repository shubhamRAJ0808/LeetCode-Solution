class Solution {
    public char slowestKey(int[] arr, String s) {
        int max = arr[0];
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            int duration = arr[i] - arr[i - 1];
            if (duration > max) {
                max = duration;
                maxIdx = i;
            }
            else if (duration == max && s.charAt(i) > s.charAt(maxIdx)) {
                maxIdx = i;
            }
        }
        return s.charAt(maxIdx);
    }
}