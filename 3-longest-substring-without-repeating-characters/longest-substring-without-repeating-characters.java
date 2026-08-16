import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();

        // pointer banaw
        int left = 0,
            right = 0;
        int maxLen = 0;

        for(right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            maxLen = Math.max(maxLen, right - left +1);
        }
        return maxLen;
        
        
    }
}