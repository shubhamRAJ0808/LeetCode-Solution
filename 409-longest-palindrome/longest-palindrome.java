
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        int count = 0;
        int subCount = 0;

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0 && freq[i] % 2 == 0) {
                count += freq[i];
            }

            if (freq[i] > 0 && freq[i] % 2 != 0) {
                count += freq[i] - 1;
                subCount++;
            }
        }

        if (subCount >= 1) {
            return count + 1;
        }

        return count;
    }
}
