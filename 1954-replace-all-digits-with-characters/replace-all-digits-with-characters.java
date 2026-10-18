class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < s.length(); i += 2) {
            char ch = s.charAt(i - 1);
            int digit = s.charAt(i) - '0';

            sb.setCharAt(i, (char)(ch + digit));
        }
        return sb.toString();
    }
}