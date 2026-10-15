class Solution {
    public int findLUSlength(String s, String t) {
        int max = -1;
        if(!s.equals(t)){
            max = Math.max(s.length(),t.length());
        }
        return max;
    }
}