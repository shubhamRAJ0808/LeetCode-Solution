
import java.util.*;

class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chars.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            HashMap<Character, Integer> temp = new HashMap<>(map);
            boolean valid = true;
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (temp.containsKey(ch) && temp.get(ch) > 0) {
                    temp.put(ch, temp.get(ch) - 1);
                } else {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                count += s.length();
            }
        }
        return count;
    }
}
