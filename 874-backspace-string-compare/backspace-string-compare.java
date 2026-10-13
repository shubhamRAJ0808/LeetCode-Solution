
class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '#') {
                if (i > 0) {
                    sb.delete(i - 1, i + 1);
                    i -= 2;
                } else {
                    sb.deleteCharAt(i);
                    i--;
                }
            }
        }
        StringBuilder tb = new StringBuilder(t);
        for (int i = 0; i < tb.length(); i++) {
            if (tb.charAt(i) == '#') {
                if (i > 0) {
                    tb.delete(i - 1, i + 1);
                    i -= 2;
                } else {
                    tb.deleteCharAt(i);
                    i--;
                }
            }
        }

        return sb.toString().equals(tb.toString());
    }
}
