import java.math.BigInteger;
import java.util.HashSet;

class Solution {
    public int numDifferentIntegers(String s) {
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    String t = sb.toString();
                    String num = normalize(t); // handles leading zeros and large numbers
                    set.add(num);
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            String t = sb.toString();
            String num = normalize(t);
            set.add(num);
            sb.setLength(0);
        }
        return set.size();
    }
    
    // Helper method to strip leading zeros (e.g., "001" becomes "1", "0" stays "0")
    private String normalize(String t) {
        int i = 0;
        while (i < t.length() - 1 && t.charAt(i) == '0') {
            i++;
        }
        return t.substring(i);
    }
}