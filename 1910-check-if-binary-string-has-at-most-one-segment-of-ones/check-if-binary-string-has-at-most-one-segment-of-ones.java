class Solution {
    public boolean checkOnesSegment(String s) {
        int c1=0;
        int c0=0;
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