class Solution {
    public int strStr(String s, String t) {
        int k = t.length();
        for(int i=0; i+k<=s.length();i++){
            String window = s.substring(i,i+k);
            if(window.equals(t)){
                return i;
            }
        }
        return -1;
        
    }
}