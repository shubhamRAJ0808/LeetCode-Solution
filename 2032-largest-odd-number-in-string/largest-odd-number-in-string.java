class Solution {
    public String largestOddNumber(String str) {
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            if((ch - '0')%2 !=0){
                return str.substring(0, i+1);
            }
        }
        return "";
        

        
    }
}