class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '0'){
                for(int j=i; j<s.length();j++){
                    if(s.charAt(j)=='1'){
                        return false;
                    }
                }

            }
        }
        return true;
    }
}