class Solution {
    public boolean isSumEqual(String f, String s, String tar) {
        return wordToInt(f) + wordToInt(s) == wordToInt(tar);
    }
    private int wordToInt(String s) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            val = val * 10 + (s.charAt(i) - 'a');
        }
        return val;
    }
}