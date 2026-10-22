
class Solution {
    public boolean strongPasswordCheckerII(String s) {
        if (s.length() < 8) {
            return false;
        }
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean special = false;
        String sp = "!@#$%^&*()-+";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i > 0 && ch == s.charAt(i - 1)) {
                return false;
            }
            if (Character.isLowerCase(ch)) {
                lower = true;
            } else if (Character.isUpperCase(ch)) {
                upper = true;
            } else if (Character.isDigit(ch)) {
                digit = true;
            } else if (sp.indexOf(ch) != -1) {
                special = true;
            }
        }
        return lower && upper && digit && special;
    }
}
