class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            result = result * 26 + (ch-'A'+1); 
        }
        return result;
    }
}