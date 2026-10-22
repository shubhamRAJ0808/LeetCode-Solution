class Solution {
    public boolean squareIsWhite(String s) {
        int alpha = s.charAt(0)-'a'+1;
        int num = s.charAt(1)-'0';
        return (alpha + num) % 2 !=0; 
    }
}