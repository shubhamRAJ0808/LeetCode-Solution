class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                continue;
            }
            while(i!=s.length()){
                if(s.charAt(i)=='1'){
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}