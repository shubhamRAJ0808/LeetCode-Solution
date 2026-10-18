class Solution {
    public boolean isLongPressedName(String s, String t) {
        if (t.length() < s.length()) return false;

        int i = 0;
        int j = 0;

        while (j < t.length()) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } 
            else if (j > 0 && t.charAt(j) == t.charAt(j - 1)) {
                j++;
            } 
            else {
                return false;
            }
        }
        return i == s.length();
    }
}