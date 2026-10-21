class Solution {
    public String removeTrailingZeros(String num) {
        num = num.replaceAll("0+$","");
        return num;
        
    }
}