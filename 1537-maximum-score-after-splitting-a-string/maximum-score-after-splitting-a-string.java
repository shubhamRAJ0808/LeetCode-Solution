
class Solution {
    public int maxScore(String s) {
        int rightOnes = 0;
        int leftZeros = 0;
        int max = 0;

        // Count all ones initially
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                rightOnes++;
            }
        }

        // Try every valid split
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }

            max = Math.max(max, leftZeros + rightOnes);
        }

        return max;
    }
}
